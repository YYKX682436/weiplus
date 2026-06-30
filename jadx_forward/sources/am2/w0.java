package am2;

/* loaded from: classes3.dex */
public final class w0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.x0 f90297d;

    public w0(am2.x0 x0Var) {
        this.f90297d = x0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.yx1 Q6;
        r45.xn1 xn1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.util.List<km2.q> list;
        am2.b1 b1Var;
        am2.b1 b1Var2;
        java.util.List<km2.q> list2;
        am2.b1 b1Var3;
        am2.b1 b1Var4;
        am2.b1 b1Var5 = null;
        if (menuItem.getItemId() == 1) {
            am2.x0 x0Var = this.f90297d;
            java.util.LinkedList linkedList = x0Var.f90303c;
            linkedList.clear();
            am2.h3 h3Var = am2.h3.f90214d;
            am2.b1 a17 = x0Var.a(h3Var, 1);
            if (a17 != null) {
                a17.f90167c = "1";
            } else {
                a17 = null;
            }
            linkedList.offerLast(a17);
            am2.b1 a18 = x0Var.a(h3Var, 5);
            if (a18 != null) {
                a18.f90168d = 4000L;
                a18.f90167c = "1";
                b1Var5 = a18;
            }
            linkedList.offerLast(b1Var5);
            am2.e1.f90190a.a(linkedList, false);
            return;
        }
        if (menuItem.getItemId() == 2) {
            am2.x0 x0Var2 = this.f90297d;
            java.util.LinkedList linkedList2 = x0Var2.f90303c;
            linkedList2.clear();
            am2.b1 a19 = x0Var2.a(am2.h3.f90224q, 5);
            if (a19 != null) {
                a19.f90168d = 150L;
            } else {
                a19 = null;
            }
            linkedList2.offerLast(a19);
            am2.b1 a27 = x0Var2.a(am2.h3.f90222o, 1);
            if (a27 != null) {
                a27.f90168d = 250L;
            } else {
                a27 = null;
            }
            linkedList2.offerLast(a27);
            for (int i18 = 0; i18 < 20; i18++) {
                am2.b1 a28 = x0Var2.a(am2.h3.f90214d, 1);
                if (a28 != null) {
                    a28.f90168d = i18 * 100;
                    a28.f90167c = "1";
                } else {
                    a28 = null;
                }
                linkedList2.offerLast(a28);
            }
            am2.e1.f90190a.a(linkedList2, false);
            return;
        }
        if (menuItem.getItemId() == 3) {
            am2.x0 x0Var3 = this.f90297d;
            java.util.LinkedList linkedList3 = x0Var3.f90303c;
            linkedList3.clear();
            linkedList3.offerLast(x0Var3.a(am2.h3.f90220m, 1));
            am2.b1 a29 = x0Var3.a(am2.h3.f90219i, 1);
            if (a29 != null) {
                a29.f90168d = 1000L;
                a29.f90170f = true;
                a29.f90169e = c01.z1.l();
                b1Var5 = a29;
            }
            linkedList3.offerLast(b1Var5);
            am2.e1.f90190a.a(linkedList3, false);
            return;
        }
        if (menuItem.getItemId() == 4) {
            java.util.LinkedList linkedList4 = this.f90297d.f90303c;
            linkedList4.clear();
            gk2.e eVar = gk2.e.f354004n;
            if (eVar != null && (list2 = ((mm2.o4) eVar.a(mm2.o4.class)).f410860v) != null) {
                for (km2.q qVar : list2) {
                    java.util.HashMap hashMap = am2.e1.f90193d;
                    am2.a1 a1Var = (am2.a1) hashMap.get(am2.h3.f90214d);
                    if (a1Var != null) {
                        b1Var3 = am2.a1.a(a1Var, 0, 1, null);
                        b1Var3.c(qVar.f390705c);
                    } else {
                        b1Var3 = null;
                    }
                    linkedList4.offerLast(b1Var3);
                    am2.a1 a1Var2 = (am2.a1) hashMap.get(am2.h3.f90221n);
                    if (a1Var2 != null) {
                        b1Var4 = am2.a1.a(a1Var2, 0, 1, null);
                        b1Var4.f90168d = 1500L;
                        b1Var4.c(qVar.f390705c);
                    } else {
                        b1Var4 = null;
                    }
                    linkedList4.offerLast(b1Var4);
                }
            }
            am2.e1.f90190a.a(linkedList4, false);
            return;
        }
        if (menuItem.getItemId() == 5) {
            am2.x0 x0Var4 = this.f90297d;
            java.util.LinkedList linkedList5 = x0Var4.f90303c;
            linkedList5.clear();
            am2.h3 h3Var2 = am2.h3.f90219i;
            am2.b1 a37 = x0Var4.a(h3Var2, 1);
            if (a37 != null) {
                a37.f90167c = "1";
            } else {
                a37 = null;
            }
            linkedList5.offerLast(a37);
            am2.b1 a38 = x0Var4.a(h3Var2, 1);
            if (a38 != null) {
                a38.f90167c = "1";
                a38.f90168d = p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d;
                b1Var5 = a38;
            }
            linkedList5.offerLast(b1Var5);
            am2.e1.f90190a.a(linkedList5, false);
            return;
        }
        if (menuItem.getItemId() == 6) {
            am2.x0 x0Var5 = this.f90297d;
            java.util.LinkedList linkedList6 = x0Var5.f90303c;
            linkedList6.clear();
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            am2.h3 h3Var3 = am2.h3.f90214d;
            am2.b1 a39 = x0Var5.a(h3Var3, 1);
            if (a39 != null) {
                a39.f90167c = uuid;
            } else {
                a39 = null;
            }
            linkedList6.offerLast(a39);
            am2.b1 a47 = x0Var5.a(h3Var3, 1);
            if (a47 != null) {
                a47.f90167c = uuid;
                b1Var5 = a47;
            }
            linkedList6.offerLast(b1Var5);
            am2.e1.f90190a.a(linkedList6, true);
            return;
        }
        if (menuItem.getItemId() == 7) {
            am2.x0 x0Var6 = this.f90297d;
            java.util.LinkedList linkedList7 = x0Var6.f90303c;
            linkedList7.clear();
            java.lang.String uuid2 = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid2, "toString(...)");
            am2.h3 h3Var4 = am2.h3.f90214d;
            am2.b1 a48 = x0Var6.a(h3Var4, 1);
            if (a48 != null) {
                a48.f90167c = uuid2;
                a48.b(uuid2);
            } else {
                a48 = null;
            }
            linkedList7.offerLast(a48);
            am2.b1 a49 = x0Var6.a(h3Var4, 1);
            if (a49 != null) {
                a49.f90167c = uuid2;
                a49.b(uuid2);
            } else {
                a49 = null;
            }
            linkedList7.offerLast(a49);
            am2.b1 a57 = x0Var6.a(h3Var4, 1);
            if (a57 != null) {
                a57.f90167c = uuid2;
                a57.b("");
            } else {
                a57 = null;
            }
            linkedList7.offerLast(a57);
            am2.e1 e1Var = am2.e1.f90190a;
            e1Var.a(linkedList7, false);
            linkedList7.clear();
            java.lang.String uuid3 = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid3, "toString(...)");
            am2.h3 h3Var5 = am2.h3.f90216f;
            am2.b1 a58 = x0Var6.a(h3Var5, 1);
            if (a58 != null) {
                a58.f90167c = uuid3;
                a58.b(uuid3);
            } else {
                a58 = null;
            }
            linkedList7.offerLast(a58);
            am2.b1 a59 = x0Var6.a(h3Var5, 1);
            if (a59 != null) {
                a59.f90167c = uuid3;
                a59.b(uuid3);
            } else {
                a59 = null;
            }
            linkedList7.offerLast(a59);
            am2.b1 a67 = x0Var6.a(h3Var5, 1);
            if (a67 != null) {
                a67.f90167c = uuid3;
                a67.b("");
                b1Var5 = a67;
            }
            linkedList7.offerLast(b1Var5);
            e1Var.a(linkedList7, true);
            return;
        }
        if (menuItem.getItemId() == 8) {
            am2.x0 x0Var7 = this.f90297d;
            java.util.LinkedList linkedList8 = x0Var7.f90303c;
            linkedList8.clear();
            am2.h3 h3Var6 = am2.h3.f90214d;
            linkedList8.offerLast(x0Var7.a(h3Var6, 1));
            linkedList8.offerLast(x0Var7.a(h3Var6, 1));
            am2.h3 h3Var7 = am2.h3.f90216f;
            am2.b1 a68 = x0Var7.a(h3Var7, 1);
            if (a68 != null) {
                a68.f90168d = 3900L;
            } else {
                a68 = null;
            }
            linkedList8.offerLast(a68);
            am2.b1 a69 = x0Var7.a(h3Var7, 1);
            if (a69 != null) {
                a69.f90168d = 3900L;
            } else {
                a69 = null;
            }
            linkedList8.offerLast(a69);
            am2.b1 a76 = x0Var7.a(h3Var6, 1);
            if (a76 != null) {
                a76.f90168d = 7900L;
            } else {
                a76 = null;
            }
            linkedList8.offerLast(a76);
            am2.b1 a77 = x0Var7.a(h3Var6, 1);
            if (a77 != null) {
                a77.f90168d = 7900L;
            } else {
                a77 = null;
            }
            linkedList8.offerLast(a77);
            am2.b1 a78 = x0Var7.a(am2.h3.f90224q, 1);
            if (a78 != null) {
                a78.f90168d = 1000L;
            } else {
                a78 = null;
            }
            linkedList8.offerLast(a78);
            am2.b1 a79 = x0Var7.a(am2.h3.f90219i, 1);
            if (a79 != null) {
                a79.f90168d = 7000L;
                b1Var5 = a79;
            }
            linkedList8.offerLast(b1Var5);
            am2.e1.f90190a.a(linkedList8, false);
            return;
        }
        if (menuItem.getItemId() == 9) {
            am2.x0 x0Var8 = this.f90297d;
            java.util.LinkedList linkedList9 = x0Var8.f90303c;
            linkedList9.clear();
            java.lang.String uuid4 = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid4, "toString(...)");
            am2.h3 h3Var8 = am2.h3.f90214d;
            am2.b1 a86 = x0Var8.a(h3Var8, 1);
            if (a86 != null) {
                a86.f90167c = uuid4;
            } else {
                a86 = null;
            }
            linkedList9.offerLast(a86);
            am2.b1 a87 = x0Var8.a(h3Var8, 10);
            if (a87 != null) {
                a87.f90167c = uuid4;
                a87.f90168d = 1000L;
            } else {
                a87 = null;
            }
            linkedList9.offerLast(a87);
            am2.b1 a88 = x0Var8.a(am2.h3.f90219i, 1);
            if (a88 != null) {
                a88.f90168d = 1001L;
                b1Var5 = a88;
            }
            linkedList9.offerLast(b1Var5);
            am2.e1.f90190a.a(linkedList9, false);
            return;
        }
        if (menuItem.getItemId() != 10) {
            if (menuItem.getItemId() == 11) {
                java.util.LinkedList linkedList10 = this.f90297d.f90303c;
                linkedList10.clear();
                gk2.e eVar2 = gk2.e.f354004n;
                if (eVar2 != null && (Q6 = ((om2.g) eVar2.a(om2.g.class)).Q6()) != null && (xn1Var = Q6.f472996i) != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
                    am2.a1 a1Var3 = (am2.a1) am2.e1.f90193d.get(am2.h3.f90225r);
                    if (a1Var3 != null) {
                        b1Var5 = am2.a1.a(a1Var3, 0, 1, null);
                        b1Var5.c(c19782x23db1cfa.m76197x6c03c64c());
                    }
                    linkedList10.offerLast(b1Var5);
                }
                am2.e1.f90190a.a(linkedList10, false);
                return;
            }
            return;
        }
        am2.x0 x0Var9 = this.f90297d;
        x0Var9.f90303c.clear();
        gk2.e eVar3 = gk2.e.f354004n;
        if (eVar3 != null && (list = ((mm2.o4) eVar3.a(mm2.o4.class)).f410857s) != null) {
            synchronized (list) {
                for (km2.q qVar2 : list) {
                    java.util.LinkedList linkedList11 = x0Var9.f90303c;
                    java.util.HashMap hashMap2 = am2.e1.f90193d;
                    am2.a1 a1Var4 = (am2.a1) hashMap2.get(am2.h3.f90214d);
                    if (a1Var4 != null) {
                        b1Var = am2.a1.a(a1Var4, 0, 1, null);
                        b1Var.c(qVar2.f390705c);
                        java.lang.String str = qVar2.f390706d;
                        if (str == null) {
                            str = "";
                        }
                        b1Var.f90169e = str;
                    } else {
                        b1Var = null;
                    }
                    linkedList11.offerLast(b1Var);
                    java.util.LinkedList linkedList12 = x0Var9.f90303c;
                    am2.a1 a1Var5 = (am2.a1) hashMap2.get(am2.h3.f90221n);
                    if (a1Var5 != null) {
                        b1Var2 = am2.a1.a(a1Var5, 0, 1, null);
                        b1Var2.f90168d = 1500L;
                        b1Var2.c(qVar2.f390705c);
                        java.lang.String str2 = qVar2.f390706d;
                        if (str2 == null) {
                            str2 = "";
                        }
                        b1Var2.f90169e = str2;
                    } else {
                        b1Var2 = null;
                    }
                    linkedList12.offerLast(b1Var2);
                }
            }
        }
        am2.e1.f90190a.a(x0Var9.f90303c, false);
    }
}
