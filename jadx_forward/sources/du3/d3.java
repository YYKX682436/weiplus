package du3;

/* loaded from: classes3.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f325092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f325093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(java.util.ArrayList arrayList, du3.t3 t3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325092d = arrayList;
        this.f325093e = t3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du3.d3(this.f325092d, this.f325093e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        du3.d3 d3Var = (du3.d3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        hk0.m d17;
        hk0.a1 f17;
        hk0.c c17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.Iterator it = this.f325092d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jz5.f0 f0Var = jz5.f0.f384359a;
            if (!hasNext) {
                return f0Var;
            }
            hk0.i iVar = (hk0.i) it.next();
            hk0.d1 d1Var = iVar.f363280a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("editDataEventFlow >> operateType: ");
            sb6.append(d1Var);
            sb6.append(", editType: ");
            hk0.k kVar = iVar.f363281b;
            sb6.append(kVar.f363290a);
            sb6.append(", editId: ");
            sb6.append(kVar.f363291b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", sb6.toString());
            int ordinal = kVar.f363290a.ordinal();
            du3.t3 t3Var = this.f325093e;
            if (ordinal == 0) {
                java.lang.String str = kVar.f363291b;
                t3Var.getClass();
                hk0.d1 d1Var2 = hk0.d1.f363253d;
                qk.g6 g6Var = qk.g6.DOODLE;
                if (d1Var == d1Var2) {
                    hk0.c c18 = t3Var.E().f363351i.c(str);
                    if (c18 != null) {
                        int ordinal2 = c18.f363238c.ordinal();
                        if (ordinal2 == 1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealBrush UNDO >> is brush");
                            l45.q qVar = t3Var.f325259p;
                            if (qVar != null) {
                                new l45.a((l45.n) qVar).b(g6Var, -4, str);
                            }
                            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_UNDO_PEN", 0, 2, null);
                        } else if (ordinal2 == 2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealBrush UNDO >> is brush_eraser");
                            l45.q qVar2 = t3Var.f325259p;
                            if (qVar2 != null) {
                                new l45.a((l45.n) qVar2).b(g6Var, -4, str);
                            }
                            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_UNDO_PEN_ERASER", 0, 2, null);
                        }
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealBrush UNDO >> data is error ".concat(str));
                    }
                } else if (d1Var == hk0.d1.f363254e && (c17 = t3Var.E().f363351i.c(str)) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealBrush Forward");
                    l45.q qVar3 = t3Var.f325259p;
                    if (qVar3 != null) {
                        new l45.a((l45.n) qVar3).b(g6Var, -2, str);
                    }
                    int ordinal3 = c17.f363238c.ordinal();
                    if (ordinal3 == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealBrush forward >> DoodleType.BRUSH");
                        nu3.i.c(nu3.i.f421751a, "KEY_CLICK_REDO_PEN", 0, 2, null);
                    } else if (ordinal3 == 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealBrush forward >> DoodleType.BRUSH_ERASER");
                        nu3.i.c(nu3.i.f421751a, "KEY_CLICK_REDO_PEN_ERASER", 0, 2, null);
                    }
                }
            } else if (ordinal == 1) {
                java.lang.String str2 = kVar.f363291b;
                t3Var.getClass();
                hk0.d1 d1Var3 = hk0.d1.f363253d;
                qk.g6 g6Var2 = qk.g6.MOSAIC;
                if (d1Var == d1Var3) {
                    hk0.w0 e17 = t3Var.E().f363351i.e(str2);
                    if (e17 != null) {
                        int ordinal4 = e17.f363369c.ordinal();
                        if (ordinal4 == 1 || ordinal4 == 2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealMosaic UNDO");
                            l45.q qVar4 = t3Var.f325259p;
                            if (qVar4 != null) {
                                new l45.a((l45.n) qVar4).b(g6Var2, -4, str2);
                            }
                            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_UNDO_MOSAIC", 0, 2, null);
                        } else if (ordinal4 == 3) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealMosaic UNDO >> is nrush_eraser so is same to forward undo");
                            l45.q qVar5 = t3Var.f325259p;
                            if (qVar5 != null) {
                                new l45.a((l45.n) qVar5).b(g6Var2, -4, str2);
                            }
                            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_UNDO_MOSAIC_ERASER", 0, 2, null);
                        }
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealBrush UNDO >> data is error ".concat(str2));
                    }
                } else if (d1Var == hk0.d1.f363254e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealMosaic Forward");
                    hk0.w0 e18 = t3Var.E().f363351i.e(str2);
                    if (e18 != null) {
                        l45.q qVar6 = t3Var.f325259p;
                        if (qVar6 != null) {
                            new l45.a((l45.n) qVar6).b(g6Var2, -2, str2);
                        }
                        int ordinal5 = e18.f363369c.ordinal();
                        if (ordinal5 == 1 || ordinal5 == 2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "FORWARD MOSAIC " + e18.f363223a);
                            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_REDO_MOSAIC", 0, 2, null);
                        } else if (ordinal5 == 3) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "FORWARD MOSAIC_ERASER");
                            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_REDO_MOSAIC_ERASER", 0, 2, null);
                        }
                    }
                }
            } else if (ordinal != 2) {
                qk.g6 g6Var3 = qk.g6.TEXT;
                if (ordinal == 3) {
                    java.lang.String str3 = kVar.f363291b;
                    t3Var.getClass();
                    int ordinal6 = d1Var.ordinal();
                    if (ordinal6 == 0) {
                        hk0.a1 f18 = t3Var.E().f363351i.f(str3);
                        if (f18 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealText >> UNDO >> " + f18.f363226c + ", " + str3 + ", " + f18.f363232i);
                            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_UNDO_TEXT", 0, 2, null);
                            int ordinal7 = f18.f363226c.ordinal();
                            if (ordinal7 == 0) {
                                l45.q qVar7 = t3Var.f325259p;
                                if (qVar7 != null) {
                                    new l45.a((l45.n) qVar7).b(g6Var3, -1, str3);
                                }
                            } else if (ordinal7 == 1) {
                                l45.q qVar8 = t3Var.f325259p;
                                if (qVar8 != null) {
                                    new l45.a((l45.n) qVar8).b(g6Var3, -3, str3);
                                }
                            } else {
                                if (ordinal7 != 2) {
                                    throw new jz5.j();
                                }
                                l45.q qVar9 = t3Var.f325259p;
                                if (qVar9 != null) {
                                    new l45.a((l45.n) qVar9).b(g6Var3, -4, str3);
                                }
                            }
                        } else {
                            continue;
                        }
                    } else if (ordinal6 == 1) {
                        hk0.a1 f19 = t3Var.E().f363351i.f(str3);
                        if (f19 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealText >> FORWARD >> " + f19.f363226c + ", " + str3 + ", " + f19.f363232i);
                            l45.q qVar10 = t3Var.f325259p;
                            if (qVar10 != null) {
                                new l45.a((l45.n) qVar10).b(g6Var3, -2, str3);
                            }
                            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_REDO_TEXT", 0, 2, null);
                        }
                    } else if (ordinal6 == 2 && (f17 = t3Var.E().f363351i.f(str3)) != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealText EDIT >> " + f17.f363226c + ", " + str3);
                        l45.q qVar11 = t3Var.f325259p;
                        if (qVar11 != null) {
                            new l45.a((l45.n) qVar11).a(g6Var3);
                        }
                        l45.q qVar12 = t3Var.f325259p;
                        if (qVar12 != null) {
                            ((l45.n) qVar12).w(t3Var.B);
                        }
                        l45.q qVar13 = t3Var.f325259p;
                        if (qVar13 != null) {
                            ((l45.n) qVar13).s(f17.f363227d, f17.f363228e, f17.f363229f, f17.f363230g);
                        }
                    }
                } else if (ordinal != 4) {
                    continue;
                } else {
                    java.lang.String str4 = kVar.f363291b;
                    t3Var.getClass();
                    int ordinal8 = d1Var.ordinal();
                    qk.g6 g6Var4 = qk.g6.EMOJI;
                    if (ordinal8 == 0) {
                        hk0.m d18 = t3Var.E().f363351i.d(str4);
                        if (d18 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealEmoji UNDO >> " + d18.f363305c + " editId: " + str4 + " lastEditId: " + d18.f363308f);
                            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_UNDO_EMOJI", 0, 2, null);
                            int ordinal9 = d18.f363305c.ordinal();
                            if (ordinal9 == 0) {
                                l45.q qVar14 = t3Var.f325259p;
                                if (qVar14 != null) {
                                    new l45.a((l45.n) qVar14).b(g6Var4, -1, str4);
                                }
                            } else if (ordinal9 == 1) {
                                l45.q qVar15 = t3Var.f325259p;
                                if (qVar15 != null) {
                                    new l45.a((l45.n) qVar15).b(g6Var4, -3, str4);
                                }
                            } else {
                                if (ordinal9 != 2) {
                                    throw new jz5.j();
                                }
                                l45.q qVar16 = t3Var.f325259p;
                                if (qVar16 != null) {
                                    new l45.a((l45.n) qVar16).b(g6Var4, -4, str4);
                                }
                            }
                        } else {
                            continue;
                        }
                    } else if (ordinal8 == 1) {
                        hk0.m d19 = t3Var.E().f363351i.d(str4);
                        if (d19 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealEmoji FORWARD >> " + d19.f363305c + " editId: " + str4 + " lastEditId: " + d19.f363308f);
                            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_REDO_EMOJI", 0, 2, null);
                            l45.q qVar17 = t3Var.f325259p;
                            if (qVar17 != null) {
                                new l45.a((l45.n) qVar17).b(g6Var4, -2, str4);
                            }
                        }
                    } else if (ordinal8 == 2 && (d17 = t3Var.E().f363351i.d(str4)) != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealEmoji EDIT >> " + d17.f363305c + ' ' + str4);
                        l45.q qVar18 = t3Var.f325259p;
                        if (qVar18 != null) {
                            new l45.a((l45.n) qVar18).a(g6Var3);
                        }
                        l45.q qVar19 = t3Var.f325259p;
                        if (qVar19 != null) {
                            ((l45.n) qVar19).w(t3Var.B);
                        }
                        l45.q qVar20 = t3Var.f325259p;
                        if (qVar20 != null) {
                            ((l45.n) qVar20).r(d17.f363306d);
                        }
                    }
                }
            } else {
                java.lang.String str5 = kVar.f363291b;
                t3Var.getClass();
                int ordinal10 = d1Var.ordinal();
                qk.g6 g6Var5 = qk.g6.CROP_PHOTO;
                if (ordinal10 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealCrop UNDO >> " + str5);
                    l45.q qVar21 = t3Var.f325259p;
                    if (qVar21 != null) {
                        new l45.a((l45.n) qVar21).b(g6Var5, -1, null);
                    }
                    nu3.i.c(nu3.i.f421751a, "KEY_CLICK_UNDO_CROP", 0, 2, null);
                } else if (ordinal10 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dealCrop FORWARD >> " + str5);
                    l45.q qVar22 = t3Var.f325259p;
                    if (qVar22 != null) {
                        new l45.a((l45.n) qVar22).b(g6Var5, -2, null);
                    }
                    nu3.i.c(nu3.i.f421751a, "KEY_CLICK_REDO_CROP", 0, 2, null);
                }
            }
        }
    }
}
