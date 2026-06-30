package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class e implements com.google.protobuf.n8 {
    @java.lang.Deprecated
    public static <T> void addAll(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
        addAll((java.lang.Iterable) iterable, (java.util.List) collection);
    }

    public static com.google.protobuf.pa newUninitializedMessageException(com.google.protobuf.o8 o8Var) {
        return new com.google.protobuf.pa(o8Var);
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String name = getClass().getName();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(name.length() + 60 + java.lang.String.valueOf(str).length());
        sb6.append("Reading ");
        sb6.append(name);
        sb6.append(" from a ");
        sb6.append(str);
        sb6.append(" threw an IOException (should never happen).");
        return sb6.toString();
    }

    public abstract com.google.protobuf.e internalMergeFrom(com.google.protobuf.f fVar);

    public boolean mergeDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        mo19mergeFrom((java.io.InputStream) new com.google.protobuf.d(inputStream, com.google.protobuf.d0.y(read, inputStream)), t4Var);
        return true;
    }

    @Override // com.google.protobuf.n8
    public abstract com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var);

    /* renamed from: mergeFrom */
    public abstract com.google.protobuf.e m14mergeFrom(byte[] bArr, int i17, int i18);

    /* renamed from: mergeFrom */
    public abstract com.google.protobuf.e m15mergeFrom(byte[] bArr, int i17, int i18, com.google.protobuf.t4 t4Var);

    public static <T> void addAll(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        iterable.getClass();
        if (iterable instanceof com.google.protobuf.g7) {
            java.util.List c17 = ((com.google.protobuf.g7) iterable).c();
            com.google.protobuf.g7 g7Var = (com.google.protobuf.g7) list;
            int size = list.size();
            for (java.lang.Object obj : c17) {
                if (obj == null) {
                    int size2 = g7Var.size() - size;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
                    sb6.append("Element at index ");
                    sb6.append(size2);
                    sb6.append(" is null.");
                    java.lang.String sb7 = sb6.toString();
                    for (int size3 = g7Var.size() - 1; size3 >= size; size3--) {
                        g7Var.remove(size3);
                    }
                    throw new java.lang.NullPointerException(sb7);
                }
                if (obj instanceof com.google.protobuf.y) {
                    g7Var.q((com.google.protobuf.y) obj);
                } else {
                    g7Var.add((java.lang.String) obj);
                }
            }
            return;
        }
        if (iterable instanceof com.google.protobuf.f9) {
            list.addAll((java.util.Collection) iterable);
            return;
        }
        if ((list instanceof java.util.ArrayList) && (iterable instanceof java.util.Collection)) {
            ((java.util.ArrayList) list).ensureCapacity(list.size() + ((java.util.Collection) iterable).size());
        }
        int size4 = list.size();
        for (T t17 : iterable) {
            if (t17 == null) {
                int size5 = list.size() - size4;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(37);
                sb8.append("Element at index ");
                sb8.append(size5);
                sb8.append(" is null.");
                java.lang.String sb9 = sb8.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        break;
                    } else {
                        list.remove(size6);
                    }
                }
                throw new java.lang.NullPointerException(sb9);
            }
            list.add(t17);
        }
    }

    public boolean mergeDelimitedFrom(java.io.InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, com.google.protobuf.t4.a());
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.google.protobuf.e mo16mergeFrom(com.google.protobuf.d0 d0Var) {
        return mergeFrom(d0Var, com.google.protobuf.t4.a());
    }

    public com.google.protobuf.e mergeFrom(com.google.protobuf.y yVar) {
        try {
            com.google.protobuf.d0 m17 = yVar.m();
            mo16mergeFrom(m17);
            m17.a(0);
            return this;
        } catch (com.google.protobuf.y6 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(a("ByteString"), e18);
        }
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.google.protobuf.e mo17mergeFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        try {
            com.google.protobuf.d0 m17 = yVar.m();
            mergeFrom(m17, t4Var);
            m17.a(0);
            return this;
        } catch (com.google.protobuf.y6 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(a("ByteString"), e18);
        }
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.google.protobuf.e mo20mergeFrom(byte[] bArr) {
        return m14mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.google.protobuf.e mo21mergeFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return m15mergeFrom(bArr, 0, bArr.length, t4Var);
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.google.protobuf.e mo18mergeFrom(java.io.InputStream inputStream) {
        com.google.protobuf.d0 g17 = com.google.protobuf.d0.g(inputStream);
        mo16mergeFrom(g17);
        g17.a(0);
        return this;
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.google.protobuf.e mo19mergeFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.d0 g17 = com.google.protobuf.d0.g(inputStream);
        mergeFrom(g17, t4Var);
        g17.a(0);
        return this;
    }

    @Override // com.google.protobuf.n8
    public com.google.protobuf.e mergeFrom(com.google.protobuf.o8 o8Var) {
        if (getDefaultInstanceForType().getClass().isInstance(o8Var)) {
            return internalMergeFrom((com.google.protobuf.f) o8Var);
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
