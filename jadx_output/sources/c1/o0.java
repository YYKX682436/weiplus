package c1;

/* loaded from: classes14.dex */
public abstract class o0 {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0 >= r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005b, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0041, code lost:
    
        if (r6 <= r14) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x004d, code lost:
    
        if (r5 >= r13) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0059, code lost:
    
        if (r15 <= r12) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(d1.g r16, d1.g r17, d1.g r18, int r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.o0.a(d1.g, d1.g, d1.g, int):boolean");
    }

    public static final boolean b(d1.g gVar, int i17, d1.g gVar2) {
        if (!((i17 == 3) || i17 == 4)) {
            if (!((i17 == 5) || i17 == 6)) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (gVar.f225631c <= gVar2.f225629a || gVar.f225629a >= gVar2.f225631c) {
                return false;
            }
        } else if (gVar.f225632d <= gVar2.f225630b || gVar.f225630b >= gVar2.f225632d) {
            return false;
        }
        return true;
    }

    public static final c1.p c(o0.i iVar, d1.g gVar, int i17) {
        d1.g c17;
        if (i17 == 3) {
            c17 = gVar.c((gVar.f225631c - gVar.f225629a) + 1, 0.0f);
        } else {
            if (i17 == 4) {
                c17 = gVar.c(-((gVar.f225631c - gVar.f225629a) + 1), 0.0f);
            } else {
                if (i17 == 5) {
                    c17 = gVar.c(0.0f, (gVar.f225632d - gVar.f225630b) + 1);
                } else {
                    if (!(i17 == 6)) {
                        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    c17 = gVar.c(0.0f, -((gVar.f225632d - gVar.f225630b) + 1));
                }
            }
        }
        int i18 = iVar.f341852f;
        c1.p pVar = null;
        if (i18 > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            int i19 = 0;
            do {
                c1.p pVar2 = (c1.p) objArr[i19];
                if (c1.l0.e(pVar2)) {
                    d1.g d17 = c1.l0.d(pVar2);
                    if (e(d17, i17, gVar) && (!e(c17, i17, gVar) || a(gVar, d17, c17, i17) || (!a(gVar, c17, d17, i17) && f(i17, gVar, d17) < f(i17, gVar, c17)))) {
                        pVar = pVar2;
                        c17 = d17;
                    }
                }
                i19++;
            } while (i19 < i18);
        }
        return pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        if (r6 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r6 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        if (r6 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
    
        if (r6 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f7, code lost:
    
        if (r6 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
    
        if (r6 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        r0 = (e0.i) r7.f310123d;
        kotlin.jvm.internal.o.g(r0, "interval");
        r13.k(r0);
        r0 = r12.f245584j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0143, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0145, code lost:
    
        ((u1.w) r0).h();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(c1.p r17, c1.p r18, int r19, yz5.l r20) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.o0.d(c1.p, c1.p, int, yz5.l):boolean");
    }

    public static final boolean e(d1.g gVar, int i17, d1.g gVar2) {
        if (i17 == 3) {
            float f17 = gVar2.f225631c;
            float f18 = gVar.f225631c;
            float f19 = gVar2.f225629a;
            if ((f17 > f18 || f19 >= f18) && f19 > gVar.f225629a) {
                return true;
            }
        } else {
            if (i17 == 4) {
                float f27 = gVar2.f225629a;
                float f28 = gVar.f225629a;
                float f29 = gVar2.f225631c;
                if ((f27 < f28 || f29 <= f28) && f29 < gVar.f225631c) {
                    return true;
                }
            } else {
                if (i17 == 5) {
                    float f37 = gVar2.f225632d;
                    float f38 = gVar.f225632d;
                    float f39 = gVar2.f225630b;
                    if ((f37 > f38 || f39 >= f38) && f39 > gVar.f225630b) {
                        return true;
                    }
                } else {
                    if (!(i17 == 6)) {
                        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    float f47 = gVar2.f225630b;
                    float f48 = gVar.f225630b;
                    float f49 = gVar2.f225632d;
                    if ((f47 < f48 || f49 <= f48) && f49 < gVar.f225632d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long f(int i17, d1.g gVar, d1.g gVar2) {
        float f17;
        float f18;
        float f19;
        float f27;
        float f28;
        float f29;
        boolean z17 = true;
        if (i17 == 3) {
            f17 = gVar.f225629a;
            f18 = gVar2.f225631c;
        } else {
            if (i17 == 4) {
                f17 = gVar2.f225629a;
                f18 = gVar.f225631c;
            } else {
                if (i17 == 5) {
                    f17 = gVar.f225630b;
                    f18 = gVar2.f225632d;
                } else {
                    if (!(i17 == 6)) {
                        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    f17 = gVar2.f225630b;
                    f18 = gVar.f225632d;
                }
            }
        }
        long abs = java.lang.Math.abs(java.lang.Math.max(0.0f, f17 - f18));
        if ((i17 == 3) || i17 == 4) {
            float f37 = gVar.f225632d;
            float f38 = gVar.f225630b;
            f19 = 2;
            f27 = f38 + ((f37 - f38) / f19);
            f28 = gVar2.f225630b;
            f29 = gVar2.f225632d;
        } else {
            if (!(i17 == 5)) {
                z17 = i17 == 6;
            }
            if (!z17) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            float f39 = gVar.f225631c;
            float f47 = gVar.f225629a;
            f19 = 2;
            f27 = f47 + ((f39 - f47) / f19);
            f28 = gVar2.f225629a;
            f29 = gVar2.f225631c;
        }
        long abs2 = java.lang.Math.abs(f27 - (f28 + ((f29 - f28) / f19)));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    public static final boolean g(c1.p pVar, c1.p pVar2, int i17, yz5.l lVar) {
        c1.p c17;
        o0.i iVar = new o0.i(new c1.p[pVar.f37766e.f341852f], 0);
        iVar.d(iVar.f341852f, pVar.f37766e);
        while (iVar.j() && (c17 = c(iVar, c1.l0.d(pVar2), i17)) != null) {
            if (!c17.f37767f.h()) {
                return ((java.lang.Boolean) lVar.invoke(c17)).booleanValue();
            }
            if (g(c17, pVar2, i17, lVar)) {
                return true;
            }
            iVar.k(c17);
        }
        return false;
    }

    public static final boolean h(c1.p twoDimensionalFocusSearch, int i17, yz5.l onFound) {
        d1.g gVar;
        kotlin.jvm.internal.o.g(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        kotlin.jvm.internal.o.g(onFound, "onFound");
        int ordinal = twoDimensionalFocusSearch.f37767f.ordinal();
        boolean z17 = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return false;
                    }
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return ((java.lang.Boolean) onFound.invoke(twoDimensionalFocusSearch)).booleanValue();
                        }
                        throw new jz5.j();
                    }
                }
            }
            c1.p pVar = twoDimensionalFocusSearch.f37768g;
            if (pVar == null) {
                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int ordinal2 = pVar.f37767f.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            if (ordinal2 != 4) {
                                if (ordinal2 != 5) {
                                    throw new jz5.j();
                                }
                            }
                        }
                        throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                }
                if (!h(pVar, i17, onFound)) {
                    c1.j0 j0Var = pVar.f37767f;
                    if (!(j0Var == c1.j0.ActiveParent || j0Var == c1.j0.DeactivatedParent)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    c1.p b17 = c1.l0.b(pVar);
                    if (b17 == null) {
                        throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    if (!d(twoDimensionalFocusSearch, b17, i17, onFound)) {
                        return false;
                    }
                }
                return true;
            }
            return d(twoDimensionalFocusSearch, pVar, i17, onFound);
        }
        o0.i a17 = c1.l0.a(twoDimensionalFocusSearch);
        if (a17.f341852f <= 1) {
            c1.p pVar2 = (c1.p) (a17.i() ? null : a17.f341850d[0]);
            if (pVar2 != null) {
                return ((java.lang.Boolean) onFound.invoke(pVar2)).booleanValue();
            }
            return false;
        }
        if ((i17 == 4) || i17 == 6) {
            d1.g d17 = c1.l0.d(twoDimensionalFocusSearch);
            float f17 = d17.f225629a;
            float f18 = d17.f225630b;
            gVar = new d1.g(f17, f18, f17, f18);
        } else {
            if (!(i17 == 3) && i17 != 5) {
                z17 = false;
            }
            if (!z17) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            d1.g d18 = c1.l0.d(twoDimensionalFocusSearch);
            float f19 = d18.f225631c;
            float f27 = d18.f225632d;
            gVar = new d1.g(f19, f27, f19, f27);
        }
        c1.p c17 = c(a17, gVar, i17);
        if (c17 != null) {
            return ((java.lang.Boolean) onFound.invoke(c17)).booleanValue();
        }
        return false;
    }
}
