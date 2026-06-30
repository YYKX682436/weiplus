package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class e implements com.p176xb6135e39.p283xc50a8b8b.n8 {
    @java.lang.Deprecated
    /* renamed from: addAll */
    public static <T> void m20621xab35b940(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
        m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) collection);
    }

    /* renamed from: newUninitializedMessageException */
    public static com.p176xb6135e39.p283xc50a8b8b.pa m20623xb3590f03(com.p176xb6135e39.p283xc50a8b8b.o8 o8Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.pa(o8Var);
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

    /* renamed from: internalMergeFrom */
    public abstract com.p176xb6135e39.p283xc50a8b8b.e mo20521xacfdf1c5(com.p176xb6135e39.p283xc50a8b8b.f fVar);

    /* renamed from: mergeDelimitedFrom */
    public boolean mo20524x92b73eb(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        mo20540x60f45402((java.io.InputStream) new com.p176xb6135e39.p283xc50a8b8b.d(inputStream, com.p176xb6135e39.p283xc50a8b8b.d0.y(read, inputStream)), t4Var);
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public abstract com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var);

    /* renamed from: mergeFrom */
    public abstract com.p176xb6135e39.p283xc50a8b8b.e m20545x60f45402(byte[] bArr, int i17, int i18);

    /* renamed from: mergeFrom */
    public abstract com.p176xb6135e39.p283xc50a8b8b.e m20546x60f45402(byte[] bArr, int i17, int i18, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var);

    /* renamed from: addAll */
    public static <T> void m20622xab35b940(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        iterable.getClass();
        if (iterable instanceof com.p176xb6135e39.p283xc50a8b8b.g7) {
            java.util.List c17 = ((com.p176xb6135e39.p283xc50a8b8b.g7) iterable).c();
            com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = (com.p176xb6135e39.p283xc50a8b8b.g7) list;
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
                if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) {
                    g7Var.q((com.p176xb6135e39.p283xc50a8b8b.y) obj);
                } else {
                    g7Var.add((java.lang.String) obj);
                }
            }
            return;
        }
        if (iterable instanceof com.p176xb6135e39.p283xc50a8b8b.f9) {
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

    /* renamed from: mergeDelimitedFrom */
    public boolean mo20523x92b73eb(java.io.InputStream inputStream) {
        return mo20524x92b73eb(inputStream, com.p176xb6135e39.p283xc50a8b8b.t4.a());
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.e mo20537x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return mo20526x60f45402(d0Var, com.p176xb6135e39.p283xc50a8b8b.t4.a());
    }

    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.e mo20529x60f45402(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        try {
            com.p176xb6135e39.p283xc50a8b8b.d0 m17 = yVar.m();
            mo20537x60f45402(m17);
            m17.a(0);
            return this;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(a("ByteString"), e18);
        }
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.e mo20538x60f45402(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        try {
            com.p176xb6135e39.p283xc50a8b8b.d0 m17 = yVar.m();
            mo20526x60f45402(m17, t4Var);
            m17.a(0);
            return this;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(a("ByteString"), e18);
        }
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.e mo20541x60f45402(byte[] bArr) {
        return m20545x60f45402(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.e mo20544x60f45402(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return m20546x60f45402(bArr, 0, bArr.length, t4Var);
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.e mo20539x60f45402(java.io.InputStream inputStream) {
        com.p176xb6135e39.p283xc50a8b8b.d0 g17 = com.p176xb6135e39.p283xc50a8b8b.d0.g(inputStream);
        mo20537x60f45402(g17);
        g17.a(0);
        return this;
    }

    @Override // 
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.e mo20540x60f45402(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.d0 g17 = com.p176xb6135e39.p283xc50a8b8b.d0.g(inputStream);
        mo20526x60f45402(g17, t4Var);
        g17.a(0);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.e mo20624x60f45402(com.p176xb6135e39.p283xc50a8b8b.o8 o8Var) {
        if (mo20559x786693c3().getClass().isInstance(o8Var)) {
            return mo20521xacfdf1c5((com.p176xb6135e39.p283xc50a8b8b.f) o8Var);
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
