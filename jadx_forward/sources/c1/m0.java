package c1;

/* loaded from: classes14.dex */
public abstract class m0 {
    public static final boolean a(c1.p pVar, yz5.l lVar) {
        boolean z17;
        int ordinal = pVar.f119300f.ordinal();
        o0.i iVar = pVar.f119299e;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            throw new jz5.j();
                        }
                        int i17 = iVar.f423385f;
                        if (i17 > 0) {
                            int i18 = i17 - 1;
                            java.lang.Object[] objArr = iVar.f423383d;
                            while (!a((c1.p) objArr[i18], lVar)) {
                                i18--;
                                if (i18 < 0) {
                                }
                            }
                            z17 = true;
                            if (!z17 || ((java.lang.Boolean) lVar.mo146xb9724478(pVar)).booleanValue()) {
                            }
                            return false;
                        }
                        z17 = false;
                        return !z17 ? true : true;
                    }
                }
            }
            c1.p pVar2 = pVar.f119301g;
            if (pVar2 == null) {
                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int ordinal2 = pVar2.f119300f.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            if (ordinal2 != 4) {
                                if (ordinal2 != 5) {
                                    throw new jz5.j();
                                }
                            } else if (a(pVar2, lVar) || c(pVar, pVar2, 2, lVar)) {
                                return true;
                            }
                        }
                        throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                } else if (a(pVar2, lVar) || ((java.lang.Boolean) lVar.mo146xb9724478(pVar2)).booleanValue()) {
                    return true;
                }
                return false;
            }
            return c(pVar, pVar2, 2, lVar);
        }
        int i19 = iVar.f423385f;
        if (i19 > 0) {
            int i27 = i19 - 1;
            java.lang.Object[] objArr2 = iVar.f423383d;
            while (!a((c1.p) objArr2[i27], lVar)) {
                i27--;
                if (i27 < 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean b(c1.p pVar, yz5.l lVar) {
        int ordinal = pVar.f119300f.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return ((java.lang.Boolean) lVar.mo146xb9724478(pVar)).booleanValue();
                        }
                        throw new jz5.j();
                    }
                }
            }
            c1.p pVar2 = pVar.f119301g;
            if (pVar2 == null) {
                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            if (!b(pVar2, lVar) && !c(pVar, pVar2, 1, lVar)) {
                return false;
            }
            return true;
        }
        o0.i iVar = pVar.f119299e;
        int i17 = iVar.f423385f;
        if (i17 <= 0) {
            return false;
        }
        java.lang.Object[] objArr = iVar.f423383d;
        int i18 = 0;
        while (!b((c1.p) objArr[i18], lVar)) {
            i18++;
            if (i18 >= i17) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(c1.p pVar, c1.p pVar2, int i17, yz5.l lVar) {
        c1.j0 j0Var = pVar.f119300f;
        c1.j0 j0Var2 = c1.j0.ActiveParent;
        c1.j0 j0Var3 = c1.j0.DeactivatedParent;
        if (!(j0Var == j0Var2 || j0Var == j0Var3)) {
            throw new java.lang.IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        boolean z17 = i17 == 1;
        o0.i iVar = pVar.f119299e;
        if (z17) {
            int i18 = new e06.k(0, iVar.f423385f - 1).f327743e;
            if (i18 >= 0) {
                boolean z18 = false;
                int i19 = 0;
                while (true) {
                    if (z18) {
                        c1.p pVar3 = (c1.p) iVar.f423383d[i19];
                        if (c1.l0.e(pVar3) && b(pVar3, lVar)) {
                            return true;
                        }
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f423383d[i19], pVar2)) {
                        z18 = true;
                    }
                    if (i19 == i18) {
                        break;
                    }
                    i19++;
                }
            }
        } else {
            if (!(i17 == 2)) {
                throw new java.lang.IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            int i27 = new e06.k(0, iVar.f423385f - 1).f327743e;
            if (i27 >= 0) {
                boolean z19 = false;
                while (true) {
                    if (z19) {
                        c1.p pVar4 = (c1.p) iVar.f423383d[i27];
                        if (c1.l0.e(pVar4) && a(pVar4, lVar)) {
                            return true;
                        }
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f423383d[i27], pVar2)) {
                        z19 = true;
                    }
                    if (i27 == 0) {
                        break;
                    }
                    i27--;
                }
            }
        }
        if (!(i17 == 1) && pVar.f119300f != j0Var3) {
            if (!(pVar.f119298d == null)) {
                return ((java.lang.Boolean) lVar.mo146xb9724478(pVar)).booleanValue();
            }
        }
        return false;
    }
}
