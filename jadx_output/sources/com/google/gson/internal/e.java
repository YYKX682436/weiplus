package com.google.gson.internal;

/* loaded from: classes15.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Type[] f44810a = new java.lang.reflect.Type[0];

    public static java.lang.reflect.Type a(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            return cls.isArray() ? new com.google.gson.internal.b(a(cls.getComponentType())) : cls;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            return new com.google.gson.internal.c(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return new com.google.gson.internal.b(((java.lang.reflect.GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof java.lang.reflect.WildcardType)) {
            return type;
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
        return new com.google.gson.internal.d(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void b(java.lang.reflect.Type type) {
        com.google.gson.internal.a.a(((type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive()) ? false : true);
    }

    public static boolean c(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof java.lang.Class) {
            return type.equals(type2);
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            if (!(type2 instanceof java.lang.reflect.ParameterizedType)) {
                return false;
            }
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) type2;
            java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
            java.lang.reflect.Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && java.util.Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            if (type2 instanceof java.lang.reflect.GenericArrayType) {
                return c(((java.lang.reflect.GenericArrayType) type).getGenericComponentType(), ((java.lang.reflect.GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            if (!(type2 instanceof java.lang.reflect.WildcardType)) {
                return false;
            }
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
            java.lang.reflect.WildcardType wildcardType2 = (java.lang.reflect.WildcardType) type2;
            return java.util.Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && java.util.Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof java.lang.reflect.TypeVariable) || !(type2 instanceof java.lang.reflect.TypeVariable)) {
            return false;
        }
        java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) type;
        java.lang.reflect.TypeVariable typeVariable2 = (java.lang.reflect.TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static java.lang.reflect.Type d(java.lang.reflect.Type type, java.lang.Class cls, java.lang.Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            java.lang.Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.Class<?> cls3 = interfaces[i17];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i17];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return d(cls.getGenericInterfaces()[i17], interfaces[i17], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != java.lang.Object.class) {
                java.lang.Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static java.lang.Class e(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
            com.google.gson.internal.a.a(rawType instanceof java.lang.Class);
            return (java.lang.Class) rawType;
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return java.lang.reflect.Array.newInstance((java.lang.Class<?>) e(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof java.lang.reflect.TypeVariable) {
            return java.lang.Object.class;
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            return e(((java.lang.reflect.WildcardType) type).getUpperBounds()[0]);
        }
        throw new java.lang.IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static java.lang.reflect.Type f(java.lang.reflect.Type type, java.lang.Class cls, java.lang.Class cls2) {
        if (type instanceof java.lang.reflect.WildcardType) {
            type = ((java.lang.reflect.WildcardType) type).getUpperBounds()[0];
        }
        com.google.gson.internal.a.a(cls2.isAssignableFrom(cls));
        return g(type, cls, d(type, cls, cls2), new java.util.HashSet());
    }

    public static java.lang.reflect.Type g(java.lang.reflect.Type type, java.lang.Class cls, java.lang.reflect.Type type2, java.util.Collection collection) {
        java.lang.reflect.TypeVariable typeVariable;
        do {
            int i17 = 0;
            if (!(type2 instanceof java.lang.reflect.TypeVariable)) {
                if (type2 instanceof java.lang.Class) {
                    java.lang.Class cls2 = (java.lang.Class) type2;
                    if (cls2.isArray()) {
                        java.lang.Class<?> componentType = cls2.getComponentType();
                        java.lang.reflect.Type g17 = g(type, cls, componentType, collection);
                        return componentType == g17 ? cls2 : new com.google.gson.internal.b(g17);
                    }
                }
                if (type2 instanceof java.lang.reflect.GenericArrayType) {
                    java.lang.reflect.GenericArrayType genericArrayType = (java.lang.reflect.GenericArrayType) type2;
                    java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
                    java.lang.reflect.Type g18 = g(type, cls, genericComponentType, collection);
                    return genericComponentType == g18 ? genericArrayType : new com.google.gson.internal.b(g18);
                }
                if (type2 instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type2;
                    java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
                    java.lang.reflect.Type g19 = g(type, cls, ownerType, collection);
                    boolean z17 = g19 != ownerType;
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i17 < length) {
                        java.lang.reflect.Type g27 = g(type, cls, actualTypeArguments[i17], collection);
                        if (g27 != actualTypeArguments[i17]) {
                            if (!z17) {
                                actualTypeArguments = (java.lang.reflect.Type[]) actualTypeArguments.clone();
                                z17 = true;
                            }
                            actualTypeArguments[i17] = g27;
                        }
                        i17++;
                    }
                    return z17 ? new com.google.gson.internal.c(g19, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z18 = type2 instanceof java.lang.reflect.WildcardType;
                java.lang.reflect.Type type3 = type2;
                if (z18) {
                    java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type2;
                    java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
                    java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        java.lang.reflect.Type g28 = g(type, cls, lowerBounds[0], collection);
                        type3 = wildcardType;
                        if (g28 != lowerBounds[0]) {
                            return new com.google.gson.internal.d(new java.lang.reflect.Type[]{java.lang.Object.class}, g28 instanceof java.lang.reflect.WildcardType ? ((java.lang.reflect.WildcardType) g28).getLowerBounds() : new java.lang.reflect.Type[]{g28});
                        }
                    } else {
                        type3 = wildcardType;
                        if (upperBounds.length == 1) {
                            java.lang.reflect.Type g29 = g(type, cls, upperBounds[0], collection);
                            type3 = wildcardType;
                            if (g29 != upperBounds[0]) {
                                return new com.google.gson.internal.d(g29 instanceof java.lang.reflect.WildcardType ? ((java.lang.reflect.WildcardType) g29).getUpperBounds() : new java.lang.reflect.Type[]{g29}, f44810a);
                            }
                        }
                    }
                }
                return type3;
            }
            typeVariable = (java.lang.reflect.TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            java.lang.reflect.GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            java.lang.Class cls3 = genericDeclaration instanceof java.lang.Class ? (java.lang.Class) genericDeclaration : null;
            if (cls3 != null) {
                java.lang.reflect.Type d17 = d(type, cls, cls3);
                if (d17 instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.TypeVariable[] typeParameters = cls3.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (i17 < length2) {
                        if (typeVariable.equals(typeParameters[i17])) {
                            type2 = ((java.lang.reflect.ParameterizedType) d17).getActualTypeArguments()[i17];
                        } else {
                            i17++;
                        }
                    }
                    throw new java.util.NoSuchElementException();
                }
            }
            type2 = typeVariable;
        } while (type2 != typeVariable);
        return type2;
    }

    public static java.lang.String h(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }
}
