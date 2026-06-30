package c1;

/* loaded from: classes14.dex */
public abstract class k0 {
    public static final void a(c1.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<this>");
        int ordinal = pVar.f37767f.ordinal();
        if (ordinal == 3) {
            pVar.a(c1.j0.Inactive);
        } else {
            if (ordinal != 4) {
                return;
            }
            pVar.a(c1.j0.ActiveParent);
        }
    }

    public static final boolean b(c1.p pVar) {
        c1.p pVar2 = pVar.f37768g;
        if (pVar2 == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        if (!c(pVar2, false)) {
            return false;
        }
        pVar.f37768g = null;
        return true;
    }

    public static final boolean c(c1.p pVar, boolean z17) {
        kotlin.jvm.internal.o.g(pVar, "<this>");
        int ordinal = pVar.f37767f.ordinal();
        c1.j0 j0Var = c1.j0.Inactive;
        if (ordinal == 0) {
            pVar.a(j0Var);
        } else {
            if (ordinal == 1) {
                if (b(pVar)) {
                    pVar.a(j0Var);
                }
                return false;
            }
            if (ordinal == 2) {
                if (!z17) {
                    return z17;
                }
                pVar.a(j0Var);
                return z17;
            }
            if (ordinal != 3) {
                if (ordinal == 4) {
                    if (b(pVar)) {
                        pVar.a(c1.j0.Deactivated);
                    }
                    return false;
                }
                if (ordinal != 5) {
                    throw new jz5.j();
                }
            }
        }
        return true;
    }

    public static final void d(c1.p pVar) {
        u1.w wVar;
        u1.r1 r1Var;
        c1.k focusManager;
        kotlin.jvm.internal.o.g(pVar, "<this>");
        int ordinal = pVar.f37767f.ordinal();
        c1.j0 j0Var = c1.j0.Deactivated;
        if (ordinal != 0) {
            if (ordinal == 1) {
                pVar.a(c1.j0.DeactivatedParent);
                return;
            } else if (ordinal != 2) {
                if (ordinal != 5) {
                    return;
                }
                pVar.a(j0Var);
                return;
            }
        }
        u1.c1 c1Var = pVar.f37775q;
        if (c1Var != null && (wVar = c1Var.f423554h) != null && (r1Var = wVar.f423689m) != null && (focusManager = r1Var.getFocusManager()) != null) {
            ((c1.m) focusManager).a(true);
        }
        pVar.a(j0Var);
    }

    public static final void e(c1.p pVar) {
        c1.j0 j0Var;
        int ordinal = pVar.f37767f.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                j0Var = c1.j0.Captured;
                pVar.a(j0Var);
            } else {
                if (ordinal == 3 || ordinal == 4) {
                    throw new java.lang.IllegalStateException("Granting focus to a deactivated node.".toString());
                }
                if (ordinal != 5) {
                    throw new jz5.j();
                }
            }
        }
        j0Var = c1.j0.Active;
        pVar.a(j0Var);
    }

    public static final void f(c1.p pVar) {
        u1.w wVar;
        kotlin.jvm.internal.o.g(pVar, "<this>");
        u1.c1 c1Var = pVar.f37775q;
        if (((c1Var == null || (wVar = c1Var.f423554h) == null) ? null : wVar.f423689m) == null) {
            pVar.f37776r = true;
            return;
        }
        int ordinal = pVar.f37767f.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (b(pVar)) {
                    e(pVar);
                    return;
                }
                return;
            } else if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                if (ordinal != 5) {
                    return;
                }
                c1.p pVar2 = pVar.f37765d;
                if (pVar2 != null) {
                    g(pVar2, pVar);
                    return;
                } else {
                    if (h(pVar)) {
                        e(pVar);
                        return;
                    }
                    return;
                }
            }
        }
        c1.i iVar = pVar.f37769h;
        if (iVar != null) {
            iVar.c();
        }
    }

    public static final boolean g(c1.p pVar, c1.p pVar2) {
        if (!pVar.f37766e.f(pVar2)) {
            throw new java.lang.IllegalStateException("Non child node cannot request focus.".toString());
        }
        int ordinal = pVar.f37767f.ordinal();
        if (ordinal == 0) {
            pVar.a(c1.j0.ActiveParent);
            pVar.f37768g = pVar2;
            e(pVar2);
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    a(pVar);
                    boolean g17 = g(pVar, pVar2);
                    d(pVar);
                    return g17;
                }
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new jz5.j();
                    }
                    c1.p pVar3 = pVar.f37765d;
                    if (pVar3 == null && h(pVar)) {
                        pVar.a(c1.j0.Active);
                        return g(pVar, pVar2);
                    }
                    if (pVar3 != null && g(pVar3, pVar)) {
                        return g(pVar, pVar2);
                    }
                } else {
                    if (pVar.f37768g == null) {
                        pVar.f37768g = pVar2;
                        e(pVar2);
                        return true;
                    }
                    if (b(pVar)) {
                        pVar.f37768g = pVar2;
                        e(pVar2);
                        return true;
                    }
                }
            }
        } else if (b(pVar)) {
            pVar.f37768g = pVar2;
            e(pVar2);
            return true;
        }
        return false;
    }

    public static final boolean h(c1.p pVar) {
        u1.w wVar;
        u1.r1 r1Var;
        u1.c1 c1Var = pVar.f37775q;
        if (c1Var == null || (wVar = c1Var.f423554h) == null || (r1Var = wVar.f423689m) == null) {
            throw new java.lang.IllegalStateException("Owner not initialized.".toString());
        }
        return r1Var.requestFocus();
    }
}
