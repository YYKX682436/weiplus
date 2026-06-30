package com.google.gson.internal;

/* loaded from: classes16.dex */
public final class c0 extends java.util.AbstractMap implements java.io.Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Comparator f44800n = new com.google.gson.internal.v();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Comparator f44801d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.gson.internal.b0 f44802e;

    /* renamed from: f, reason: collision with root package name */
    public int f44803f;

    /* renamed from: g, reason: collision with root package name */
    public int f44804g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.gson.internal.b0 f44805h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.gson.internal.x f44806i;

    /* renamed from: m, reason: collision with root package name */
    public com.google.gson.internal.z f44807m;

    public c0() {
        java.util.Comparator comparator = f44800n;
        this.f44803f = 0;
        this.f44804g = 0;
        this.f44805h = new com.google.gson.internal.b0();
        this.f44801d = comparator;
    }

    public com.google.gson.internal.b0 a(java.lang.Object obj, boolean z17) {
        int i17;
        com.google.gson.internal.b0 b0Var;
        com.google.gson.internal.b0 b0Var2 = this.f44802e;
        java.util.Comparator comparator = f44800n;
        java.util.Comparator comparator2 = this.f44801d;
        if (b0Var2 != null) {
            java.lang.Comparable comparable = comparator2 == comparator ? (java.lang.Comparable) obj : null;
            while (true) {
                java.lang.Object obj2 = b0Var2.f44707i;
                i17 = comparable != null ? comparable.compareTo(obj2) : comparator2.compare(obj, obj2);
                if (i17 == 0) {
                    return b0Var2;
                }
                com.google.gson.internal.b0 b0Var3 = i17 < 0 ? b0Var2.f44703e : b0Var2.f44704f;
                if (b0Var3 == null) {
                    break;
                }
                b0Var2 = b0Var3;
            }
        } else {
            i17 = 0;
        }
        if (!z17) {
            return null;
        }
        com.google.gson.internal.b0 b0Var4 = this.f44805h;
        if (b0Var2 != null) {
            b0Var = new com.google.gson.internal.b0(b0Var2, obj, b0Var4, b0Var4.f44706h);
            if (i17 < 0) {
                b0Var2.f44703e = b0Var;
            } else {
                b0Var2.f44704f = b0Var;
            }
            c(b0Var2, true);
        } else {
            if (comparator2 == comparator && !(obj instanceof java.lang.Comparable)) {
                throw new java.lang.ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            b0Var = new com.google.gson.internal.b0(b0Var2, obj, b0Var4, b0Var4.f44706h);
            this.f44802e = b0Var;
        }
        this.f44803f++;
        this.f44804g++;
        return b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.gson.internal.b0 b(java.util.Map.Entry r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            com.google.gson.internal.b0 r0 = r5.a(r0, r1)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L28
            java.lang.Object r3 = r0.f44708m
            java.lang.Object r6 = r6.getValue()
            r4 = 1
            if (r3 == r6) goto L24
            if (r3 == 0) goto L22
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L22
            goto L24
        L22:
            r6 = r1
            goto L25
        L24:
            r6 = r4
        L25:
            if (r6 == 0) goto L28
            r1 = r4
        L28:
            if (r1 == 0) goto L2b
            r2 = r0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.c0.b(java.util.Map$Entry):com.google.gson.internal.b0");
    }

    public final void c(com.google.gson.internal.b0 b0Var, boolean z17) {
        while (b0Var != null) {
            com.google.gson.internal.b0 b0Var2 = b0Var.f44703e;
            com.google.gson.internal.b0 b0Var3 = b0Var.f44704f;
            int i17 = b0Var2 != null ? b0Var2.f44709n : 0;
            int i18 = b0Var3 != null ? b0Var3.f44709n : 0;
            int i19 = i17 - i18;
            if (i19 == -2) {
                com.google.gson.internal.b0 b0Var4 = b0Var3.f44703e;
                com.google.gson.internal.b0 b0Var5 = b0Var3.f44704f;
                int i27 = (b0Var4 != null ? b0Var4.f44709n : 0) - (b0Var5 != null ? b0Var5.f44709n : 0);
                if (i27 == -1 || (i27 == 0 && !z17)) {
                    f(b0Var);
                } else {
                    g(b0Var3);
                    f(b0Var);
                }
                if (z17) {
                    return;
                }
            } else if (i19 == 2) {
                com.google.gson.internal.b0 b0Var6 = b0Var2.f44703e;
                com.google.gson.internal.b0 b0Var7 = b0Var2.f44704f;
                int i28 = (b0Var6 != null ? b0Var6.f44709n : 0) - (b0Var7 != null ? b0Var7.f44709n : 0);
                if (i28 == 1 || (i28 == 0 && !z17)) {
                    g(b0Var);
                } else {
                    f(b0Var2);
                    g(b0Var);
                }
                if (z17) {
                    return;
                }
            } else if (i19 == 0) {
                b0Var.f44709n = i17 + 1;
                if (z17) {
                    return;
                }
            } else {
                b0Var.f44709n = java.lang.Math.max(i17, i18) + 1;
                if (!z17) {
                    return;
                }
            }
            b0Var = b0Var.f44702d;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f44802e = null;
        this.f44803f = 0;
        this.f44804g++;
        com.google.gson.internal.b0 b0Var = this.f44805h;
        b0Var.f44706h = b0Var;
        b0Var.f44705g = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            com.google.gson.internal.b0 r2 = r1.a(r2, r0)     // Catch: java.lang.ClassCastException -> L8
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto Lc
            r0 = 1
        Lc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.c0.containsKey(java.lang.Object):boolean");
    }

    public void d(com.google.gson.internal.b0 b0Var, boolean z17) {
        com.google.gson.internal.b0 b0Var2;
        com.google.gson.internal.b0 b0Var3;
        int i17;
        if (z17) {
            com.google.gson.internal.b0 b0Var4 = b0Var.f44706h;
            b0Var4.f44705g = b0Var.f44705g;
            b0Var.f44705g.f44706h = b0Var4;
        }
        com.google.gson.internal.b0 b0Var5 = b0Var.f44703e;
        com.google.gson.internal.b0 b0Var6 = b0Var.f44704f;
        com.google.gson.internal.b0 b0Var7 = b0Var.f44702d;
        int i18 = 0;
        if (b0Var5 == null || b0Var6 == null) {
            if (b0Var5 != null) {
                e(b0Var, b0Var5);
                b0Var.f44703e = null;
            } else if (b0Var6 != null) {
                e(b0Var, b0Var6);
                b0Var.f44704f = null;
            } else {
                e(b0Var, null);
            }
            c(b0Var7, false);
            this.f44803f--;
            this.f44804g++;
            return;
        }
        if (b0Var5.f44709n > b0Var6.f44709n) {
            com.google.gson.internal.b0 b0Var8 = b0Var5.f44704f;
            while (true) {
                com.google.gson.internal.b0 b0Var9 = b0Var8;
                b0Var3 = b0Var5;
                b0Var5 = b0Var9;
                if (b0Var5 == null) {
                    break;
                } else {
                    b0Var8 = b0Var5.f44704f;
                }
            }
        } else {
            com.google.gson.internal.b0 b0Var10 = b0Var6.f44703e;
            while (true) {
                b0Var2 = b0Var6;
                b0Var6 = b0Var10;
                if (b0Var6 == null) {
                    break;
                } else {
                    b0Var10 = b0Var6.f44703e;
                }
            }
            b0Var3 = b0Var2;
        }
        d(b0Var3, false);
        com.google.gson.internal.b0 b0Var11 = b0Var.f44703e;
        if (b0Var11 != null) {
            i17 = b0Var11.f44709n;
            b0Var3.f44703e = b0Var11;
            b0Var11.f44702d = b0Var3;
            b0Var.f44703e = null;
        } else {
            i17 = 0;
        }
        com.google.gson.internal.b0 b0Var12 = b0Var.f44704f;
        if (b0Var12 != null) {
            i18 = b0Var12.f44709n;
            b0Var3.f44704f = b0Var12;
            b0Var12.f44702d = b0Var3;
            b0Var.f44704f = null;
        }
        b0Var3.f44709n = java.lang.Math.max(i17, i18) + 1;
        e(b0Var, b0Var3);
    }

    public final void e(com.google.gson.internal.b0 b0Var, com.google.gson.internal.b0 b0Var2) {
        com.google.gson.internal.b0 b0Var3 = b0Var.f44702d;
        b0Var.f44702d = null;
        if (b0Var2 != null) {
            b0Var2.f44702d = b0Var3;
        }
        if (b0Var3 == null) {
            this.f44802e = b0Var2;
        } else if (b0Var3.f44703e == b0Var) {
            b0Var3.f44703e = b0Var2;
        } else {
            b0Var3.f44704f = b0Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        com.google.gson.internal.x xVar = this.f44806i;
        if (xVar != null) {
            return xVar;
        }
        com.google.gson.internal.x xVar2 = new com.google.gson.internal.x(this);
        this.f44806i = xVar2;
        return xVar2;
    }

    public final void f(com.google.gson.internal.b0 b0Var) {
        com.google.gson.internal.b0 b0Var2 = b0Var.f44703e;
        com.google.gson.internal.b0 b0Var3 = b0Var.f44704f;
        com.google.gson.internal.b0 b0Var4 = b0Var3.f44703e;
        com.google.gson.internal.b0 b0Var5 = b0Var3.f44704f;
        b0Var.f44704f = b0Var4;
        if (b0Var4 != null) {
            b0Var4.f44702d = b0Var;
        }
        e(b0Var, b0Var3);
        b0Var3.f44703e = b0Var;
        b0Var.f44702d = b0Var3;
        int max = java.lang.Math.max(b0Var2 != null ? b0Var2.f44709n : 0, b0Var4 != null ? b0Var4.f44709n : 0) + 1;
        b0Var.f44709n = max;
        b0Var3.f44709n = java.lang.Math.max(max, b0Var5 != null ? b0Var5.f44709n : 0) + 1;
    }

    public final void g(com.google.gson.internal.b0 b0Var) {
        com.google.gson.internal.b0 b0Var2 = b0Var.f44703e;
        com.google.gson.internal.b0 b0Var3 = b0Var.f44704f;
        com.google.gson.internal.b0 b0Var4 = b0Var2.f44703e;
        com.google.gson.internal.b0 b0Var5 = b0Var2.f44704f;
        b0Var.f44703e = b0Var5;
        if (b0Var5 != null) {
            b0Var5.f44702d = b0Var;
        }
        e(b0Var, b0Var2);
        b0Var2.f44704f = b0Var;
        b0Var.f44702d = b0Var2;
        int max = java.lang.Math.max(b0Var3 != null ? b0Var3.f44709n : 0, b0Var5 != null ? b0Var5.f44709n : 0) + 1;
        b0Var.f44709n = max;
        b0Var2.f44709n = java.lang.Math.max(max, b0Var4 != null ? b0Var4.f44709n : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.gson.internal.b0 r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            java.lang.Object r0 = r3.f44708m
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.c0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        com.google.gson.internal.z zVar = this.f44807m;
        if (zVar != null) {
            return zVar;
        }
        com.google.gson.internal.z zVar2 = new com.google.gson.internal.z(this);
        this.f44807m = zVar2;
        return zVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        com.google.gson.internal.b0 a17 = a(obj, true);
        java.lang.Object obj3 = a17.f44708m;
        a17.f44708m = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.gson.internal.b0 r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.d(r3, r1)
        L10:
            if (r3 == 0) goto L14
            java.lang.Object r0 = r3.f44708m
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.c0.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f44803f;
    }
}
