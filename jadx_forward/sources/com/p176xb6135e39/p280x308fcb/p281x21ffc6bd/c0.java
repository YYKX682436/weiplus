package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes16.dex */
public final class c0 extends java.util.AbstractMap implements java.io.Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Comparator f126333n = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.v();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Comparator f126334d;

    /* renamed from: e, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 f126335e;

    /* renamed from: f, reason: collision with root package name */
    public int f126336f;

    /* renamed from: g, reason: collision with root package name */
    public int f126337g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 f126338h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.x f126339i;

    /* renamed from: m, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.z f126340m;

    public c0() {
        java.util.Comparator comparator = f126333n;
        this.f126336f = 0;
        this.f126337g = 0;
        this.f126338h = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0();
        this.f126334d = comparator;
    }

    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 a(java.lang.Object obj, boolean z17) {
        int i17;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var2 = this.f126335e;
        java.util.Comparator comparator = f126333n;
        java.util.Comparator comparator2 = this.f126334d;
        if (b0Var2 != null) {
            java.lang.Comparable comparable = comparator2 == comparator ? (java.lang.Comparable) obj : null;
            while (true) {
                java.lang.Object obj2 = b0Var2.f126240i;
                i17 = comparable != null ? comparable.compareTo(obj2) : comparator2.compare(obj, obj2);
                if (i17 == 0) {
                    return b0Var2;
                }
                com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var3 = i17 < 0 ? b0Var2.f126236e : b0Var2.f126237f;
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
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var4 = this.f126338h;
        if (b0Var2 != null) {
            b0Var = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0(b0Var2, obj, b0Var4, b0Var4.f126239h);
            if (i17 < 0) {
                b0Var2.f126236e = b0Var;
            } else {
                b0Var2.f126237f = b0Var;
            }
            c(b0Var2, true);
        } else {
            if (comparator2 == comparator && !(obj instanceof java.lang.Comparable)) {
                throw new java.lang.ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            b0Var = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0(b0Var2, obj, b0Var4, b0Var4.f126239h);
            this.f126335e = b0Var;
        }
        this.f126336f++;
        this.f126337g++;
        return b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b(java.util.Map.Entry r6) {
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
            java.lang.Object r3 = r0.f126241m
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0.b(java.util.Map$Entry):com.google.gson.internal.b0");
    }

    public final void c(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var, boolean z17) {
        while (b0Var != null) {
            com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var2 = b0Var.f126236e;
            com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var3 = b0Var.f126237f;
            int i17 = b0Var2 != null ? b0Var2.f126242n : 0;
            int i18 = b0Var3 != null ? b0Var3.f126242n : 0;
            int i19 = i17 - i18;
            if (i19 == -2) {
                com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var4 = b0Var3.f126236e;
                com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var5 = b0Var3.f126237f;
                int i27 = (b0Var4 != null ? b0Var4.f126242n : 0) - (b0Var5 != null ? b0Var5.f126242n : 0);
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
                com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var6 = b0Var2.f126236e;
                com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var7 = b0Var2.f126237f;
                int i28 = (b0Var6 != null ? b0Var6.f126242n : 0) - (b0Var7 != null ? b0Var7.f126242n : 0);
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
                b0Var.f126242n = i17 + 1;
                if (z17) {
                    return;
                }
            } else {
                b0Var.f126242n = java.lang.Math.max(i17, i18) + 1;
                if (!z17) {
                    return;
                }
            }
            b0Var = b0Var.f126235d;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f126335e = null;
        this.f126336f = 0;
        this.f126337g++;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var = this.f126338h;
        b0Var.f126239h = b0Var;
        b0Var.f126238g = b0Var;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0.containsKey(java.lang.Object):boolean");
    }

    public void d(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var, boolean z17) {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var2;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var3;
        int i17;
        if (z17) {
            com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var4 = b0Var.f126239h;
            b0Var4.f126238g = b0Var.f126238g;
            b0Var.f126238g.f126239h = b0Var4;
        }
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var5 = b0Var.f126236e;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var6 = b0Var.f126237f;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var7 = b0Var.f126235d;
        int i18 = 0;
        if (b0Var5 == null || b0Var6 == null) {
            if (b0Var5 != null) {
                e(b0Var, b0Var5);
                b0Var.f126236e = null;
            } else if (b0Var6 != null) {
                e(b0Var, b0Var6);
                b0Var.f126237f = null;
            } else {
                e(b0Var, null);
            }
            c(b0Var7, false);
            this.f126336f--;
            this.f126337g++;
            return;
        }
        if (b0Var5.f126242n > b0Var6.f126242n) {
            com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var8 = b0Var5.f126237f;
            while (true) {
                com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var9 = b0Var8;
                b0Var3 = b0Var5;
                b0Var5 = b0Var9;
                if (b0Var5 == null) {
                    break;
                } else {
                    b0Var8 = b0Var5.f126237f;
                }
            }
        } else {
            com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var10 = b0Var6.f126236e;
            while (true) {
                b0Var2 = b0Var6;
                b0Var6 = b0Var10;
                if (b0Var6 == null) {
                    break;
                } else {
                    b0Var10 = b0Var6.f126236e;
                }
            }
            b0Var3 = b0Var2;
        }
        d(b0Var3, false);
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var11 = b0Var.f126236e;
        if (b0Var11 != null) {
            i17 = b0Var11.f126242n;
            b0Var3.f126236e = b0Var11;
            b0Var11.f126235d = b0Var3;
            b0Var.f126236e = null;
        } else {
            i17 = 0;
        }
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var12 = b0Var.f126237f;
        if (b0Var12 != null) {
            i18 = b0Var12.f126242n;
            b0Var3.f126237f = b0Var12;
            b0Var12.f126235d = b0Var3;
            b0Var.f126237f = null;
        }
        b0Var3.f126242n = java.lang.Math.max(i17, i18) + 1;
        e(b0Var, b0Var3);
    }

    public final void e(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var, com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var2) {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var3 = b0Var.f126235d;
        b0Var.f126235d = null;
        if (b0Var2 != null) {
            b0Var2.f126235d = b0Var3;
        }
        if (b0Var3 == null) {
            this.f126335e = b0Var2;
        } else if (b0Var3.f126236e == b0Var) {
            b0Var3.f126236e = b0Var2;
        } else {
            b0Var3.f126237f = b0Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.x xVar = this.f126339i;
        if (xVar != null) {
            return xVar;
        }
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.x xVar2 = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.x(this);
        this.f126339i = xVar2;
        return xVar2;
    }

    public final void f(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var) {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var2 = b0Var.f126236e;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var3 = b0Var.f126237f;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var4 = b0Var3.f126236e;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var5 = b0Var3.f126237f;
        b0Var.f126237f = b0Var4;
        if (b0Var4 != null) {
            b0Var4.f126235d = b0Var;
        }
        e(b0Var, b0Var3);
        b0Var3.f126236e = b0Var;
        b0Var.f126235d = b0Var3;
        int max = java.lang.Math.max(b0Var2 != null ? b0Var2.f126242n : 0, b0Var4 != null ? b0Var4.f126242n : 0) + 1;
        b0Var.f126242n = max;
        b0Var3.f126242n = java.lang.Math.max(max, b0Var5 != null ? b0Var5.f126242n : 0) + 1;
    }

    public final void g(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var) {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var2 = b0Var.f126236e;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var3 = b0Var.f126237f;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var4 = b0Var2.f126236e;
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var5 = b0Var2.f126237f;
        b0Var.f126236e = b0Var5;
        if (b0Var5 != null) {
            b0Var5.f126235d = b0Var;
        }
        e(b0Var, b0Var2);
        b0Var2.f126237f = b0Var;
        b0Var.f126235d = b0Var2;
        int max = java.lang.Math.max(b0Var3 != null ? b0Var3.f126242n : 0, b0Var5 != null ? b0Var5.f126242n : 0) + 1;
        b0Var.f126242n = max;
        b0Var2.f126242n = java.lang.Math.max(max, b0Var4 != null ? b0Var4.f126242n : 0) + 1;
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
            java.lang.Object r0 = r3.f126241m
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.z zVar = this.f126340m;
        if (zVar != null) {
            return zVar;
        }
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.z zVar2 = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.z(this);
        this.f126340m = zVar2;
        return zVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 a17 = a(obj, true);
        java.lang.Object obj3 = a17.f126241m;
        a17.f126241m = obj2;
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
            java.lang.Object r0 = r3.f126241m
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f126336f;
    }
}
