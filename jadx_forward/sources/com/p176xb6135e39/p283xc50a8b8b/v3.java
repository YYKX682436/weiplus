package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class v3 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f127139b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f127140c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f127141d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f127142e = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f127138a = new java.util.HashSet();

    public v3(com.p176xb6135e39.p283xc50a8b8b.d4[] d4VarArr, boolean z17) {
        this.f127139b = z17;
        for (int i17 = 0; i17 < d4VarArr.length; i17++) {
            ((java.util.HashSet) this.f127138a).add(d4VarArr[i17]);
            d(d4VarArr[i17]);
        }
        java.util.Iterator it = ((java.util.HashSet) this.f127138a).iterator();
        while (it.hasNext()) {
            com.p176xb6135e39.p283xc50a8b8b.d4 d4Var = (com.p176xb6135e39.p283xc50a8b8b.d4) it.next();
            try {
                a(d4Var.f126537d.g(), d4Var);
            } catch (com.p176xb6135e39.p283xc50a8b8b.w3 e17) {
                throw new java.lang.AssertionError(e17);
            }
        }
    }

    public void a(java.lang.String str, com.p176xb6135e39.p283xc50a8b8b.d4 d4Var) {
        java.lang.String substring;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            substring = str;
        } else {
            a(str.substring(0, lastIndexOf), d4Var);
            substring = str.substring(lastIndexOf + 1);
        }
        com.p176xb6135e39.p283xc50a8b8b.t3 t3Var = new com.p176xb6135e39.p283xc50a8b8b.t3(substring, str, d4Var);
        java.util.Map map = this.f127140c;
        com.p176xb6135e39.p283xc50a8b8b.e4 e4Var = (com.p176xb6135e39.p283xc50a8b8b.e4) map.put(str, t3Var);
        if (e4Var != null) {
            map.put(str, e4Var);
            if (e4Var instanceof com.p176xb6135e39.p283xc50a8b8b.t3) {
                return;
            }
            java.lang.String mo20569xfb82e301 = e4Var.h().mo20569xfb82e301();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(substring).length() + 69 + java.lang.String.valueOf(mo20569xfb82e301).length());
            sb6.append('\"');
            sb6.append(substring);
            sb6.append("\" is already defined (as something other than a package) in file \"");
            sb6.append(mo20569xfb82e301);
            sb6.append("\".");
            throw new com.p176xb6135e39.p283xc50a8b8b.w3(d4Var, sb6.toString(), null);
        }
    }

    public void b(com.p176xb6135e39.p283xc50a8b8b.e4 e4Var) {
        java.lang.String mo20569xfb82e301 = e4Var.mo20569xfb82e301();
        if (mo20569xfb82e301.length() == 0) {
            throw new com.p176xb6135e39.p283xc50a8b8b.w3(e4Var, "Missing name.");
        }
        for (int i17 = 0; i17 < mo20569xfb82e301.length(); i17++) {
            char charAt = mo20569xfb82e301.charAt(i17);
            if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && charAt != '_' && ('0' > charAt || charAt > '9' || i17 <= 0))) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(mo20569xfb82e301.length() + 29);
                sb6.append('\"');
                sb6.append(mo20569xfb82e301);
                sb6.append("\" is not a valid identifier.");
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(e4Var, sb6.toString());
            }
        }
        java.lang.String i18 = e4Var.i();
        java.util.Map map = this.f127140c;
        com.p176xb6135e39.p283xc50a8b8b.e4 e4Var2 = (com.p176xb6135e39.p283xc50a8b8b.e4) ((java.util.HashMap) map).put(i18, e4Var);
        if (e4Var2 != null) {
            ((java.util.HashMap) map).put(i18, e4Var2);
            if (e4Var.h() != e4Var2.h()) {
                java.lang.String mo20569xfb82e3012 = e4Var2.h().mo20569xfb82e301();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(i18).length() + 33 + java.lang.String.valueOf(mo20569xfb82e3012).length());
                sb7.append('\"');
                sb7.append(i18);
                sb7.append("\" is already defined in file \"");
                sb7.append(mo20569xfb82e3012);
                sb7.append("\".");
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(e4Var, sb7.toString());
            }
            int lastIndexOf = i18.lastIndexOf(46);
            if (lastIndexOf == -1) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(i18.length() + 22);
                sb8.append('\"');
                sb8.append(i18);
                sb8.append("\" is already defined.");
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(e4Var, sb8.toString());
            }
            java.lang.String substring = i18.substring(lastIndexOf + 1);
            java.lang.String substring2 = i18.substring(0, lastIndexOf);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(substring).length() + 28 + java.lang.String.valueOf(substring2).length());
            sb9.append('\"');
            sb9.append(substring);
            sb9.append("\" is already defined in \"");
            sb9.append(substring2);
            sb9.append("\".");
            throw new com.p176xb6135e39.p283xc50a8b8b.w3(e4Var, sb9.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (((r0 instanceof com.p176xb6135e39.p283xc50a8b8b.r3) || (r0 instanceof com.p176xb6135e39.p283xc50a8b8b.x3)) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (((r0 instanceof com.p176xb6135e39.p283xc50a8b8b.r3) || (r0 instanceof com.p176xb6135e39.p283xc50a8b8b.x3) || (r0 instanceof com.p176xb6135e39.p283xc50a8b8b.t3) || (r0 instanceof com.p176xb6135e39.p283xc50a8b8b.h4)) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.e4 c(java.lang.String r9, com.p176xb6135e39.p283xc50a8b8b.u3 r10) {
        /*
            r8 = this;
            java.util.Map r0 = r8.f127140c
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r9)
            com.google.protobuf.e4 r0 = (com.p176xb6135e39.p283xc50a8b8b.e4) r0
            com.google.protobuf.u3 r1 = com.p176xb6135e39.p283xc50a8b8b.u3.AGGREGATES_ONLY
            com.google.protobuf.u3 r2 = com.p176xb6135e39.p283xc50a8b8b.u3.TYPES_ONLY
            com.google.protobuf.u3 r3 = com.p176xb6135e39.p283xc50a8b8b.u3.ALL_SYMBOLS
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L3f
            if (r10 == r3) goto L3e
            if (r10 != r2) goto L26
            boolean r6 = r0 instanceof com.p176xb6135e39.p283xc50a8b8b.r3
            if (r6 != 0) goto L23
            boolean r6 = r0 instanceof com.p176xb6135e39.p283xc50a8b8b.x3
            if (r6 == 0) goto L21
            goto L23
        L21:
            r6 = r4
            goto L24
        L23:
            r6 = r5
        L24:
            if (r6 != 0) goto L3e
        L26:
            if (r10 != r1) goto L3f
            boolean r6 = r0 instanceof com.p176xb6135e39.p283xc50a8b8b.r3
            if (r6 != 0) goto L3b
            boolean r6 = r0 instanceof com.p176xb6135e39.p283xc50a8b8b.x3
            if (r6 != 0) goto L3b
            boolean r6 = r0 instanceof com.p176xb6135e39.p283xc50a8b8b.t3
            if (r6 != 0) goto L3b
            boolean r6 = r0 instanceof com.p176xb6135e39.p283xc50a8b8b.h4
            if (r6 == 0) goto L39
            goto L3b
        L39:
            r6 = r4
            goto L3c
        L3b:
            r6 = r5
        L3c:
            if (r6 == 0) goto L3f
        L3e:
            return r0
        L3f:
            java.util.Set r0 = r8.f127138a
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L8c
            java.lang.Object r6 = r0.next()
            com.google.protobuf.d4 r6 = (com.p176xb6135e39.p283xc50a8b8b.d4) r6
            com.google.protobuf.v3 r6 = r6.f126543m
            java.util.Map r6 = r6.f127140c
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r9)
            com.google.protobuf.e4 r6 = (com.p176xb6135e39.p283xc50a8b8b.e4) r6
            if (r6 == 0) goto L47
            if (r10 == r3) goto L8b
            if (r10 != r2) goto L73
            boolean r7 = r6 instanceof com.p176xb6135e39.p283xc50a8b8b.r3
            if (r7 != 0) goto L70
            boolean r7 = r6 instanceof com.p176xb6135e39.p283xc50a8b8b.x3
            if (r7 == 0) goto L6e
            goto L70
        L6e:
            r7 = r4
            goto L71
        L70:
            r7 = r5
        L71:
            if (r7 != 0) goto L8b
        L73:
            if (r10 != r1) goto L47
            boolean r7 = r6 instanceof com.p176xb6135e39.p283xc50a8b8b.r3
            if (r7 != 0) goto L88
            boolean r7 = r6 instanceof com.p176xb6135e39.p283xc50a8b8b.x3
            if (r7 != 0) goto L88
            boolean r7 = r6 instanceof com.p176xb6135e39.p283xc50a8b8b.t3
            if (r7 != 0) goto L88
            boolean r7 = r6 instanceof com.p176xb6135e39.p283xc50a8b8b.h4
            if (r7 == 0) goto L86
            goto L88
        L86:
            r7 = r4
            goto L89
        L88:
            r7 = r5
        L89:
            if (r7 == 0) goto L47
        L8b:
            return r6
        L8c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.v3.c(java.lang.String, com.google.protobuf.u3):com.google.protobuf.e4");
    }

    public final void d(com.p176xb6135e39.p283xc50a8b8b.d4 d4Var) {
        for (com.p176xb6135e39.p283xc50a8b8b.d4 d4Var2 : java.util.Collections.unmodifiableList(java.util.Arrays.asList(d4Var.f126542i))) {
            if (this.f127138a.add(d4Var2)) {
                d(d4Var2);
            }
        }
    }

    public com.p176xb6135e39.p283xc50a8b8b.e4 e(java.lang.String str, com.p176xb6135e39.p283xc50a8b8b.e4 e4Var, com.p176xb6135e39.p283xc50a8b8b.u3 u3Var) {
        com.p176xb6135e39.p283xc50a8b8b.e4 c17;
        java.lang.String str2;
        if (str.startsWith(".")) {
            str2 = str.substring(1);
            c17 = c(str2, u3Var);
        } else {
            int indexOf = str.indexOf(46);
            java.lang.String substring = indexOf == -1 ? str : str.substring(0, indexOf);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(e4Var.i());
            while (true) {
                int lastIndexOf = sb6.lastIndexOf(".");
                if (lastIndexOf == -1) {
                    c17 = c(str, u3Var);
                    str2 = str;
                    break;
                }
                int i17 = lastIndexOf + 1;
                sb6.setLength(i17);
                sb6.append(substring);
                com.p176xb6135e39.p283xc50a8b8b.e4 c18 = c(sb6.toString(), com.p176xb6135e39.p283xc50a8b8b.u3.AGGREGATES_ONLY);
                if (c18 != null) {
                    if (indexOf != -1) {
                        sb6.setLength(i17);
                        sb6.append(str);
                        c17 = c(sb6.toString(), u3Var);
                    } else {
                        c17 = c18;
                    }
                    str2 = sb6.toString();
                } else {
                    sb6.setLength(lastIndexOf);
                }
            }
        }
        if (c17 != null) {
            return c17;
        }
        if (!this.f127139b || u3Var != com.p176xb6135e39.p283xc50a8b8b.u3.TYPES_ONLY) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(str.length() + 18);
            sb7.append('\"');
            sb7.append(str);
            sb7.append("\" is not defined.");
            throw new com.p176xb6135e39.p283xc50a8b8b.w3(e4Var, sb7.toString());
        }
        java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.i4.f126724a;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str.length() + 87);
        sb8.append("The descriptor for message type \"");
        sb8.append(str);
        sb8.append("\" can not be found and a placeholder is created for it");
        logger.warning(sb8.toString());
        com.p176xb6135e39.p283xc50a8b8b.r3 r3Var = new com.p176xb6135e39.p283xc50a8b8b.r3(str2);
        ((java.util.HashSet) this.f127138a).add(r3Var.f127001f);
        return r3Var;
    }
}
