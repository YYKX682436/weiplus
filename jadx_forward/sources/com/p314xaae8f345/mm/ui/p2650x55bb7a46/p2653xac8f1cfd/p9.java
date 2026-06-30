package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class p9 implements android.view.View.OnDragListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q9 f281213d;

    public p9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q9 q9Var) {
        this.f281213d = q9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // android.view.View.OnDragListener
    public boolean onDrag(android.view.View view, android.view.DragEvent dragEvent) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q9 q9Var = this.f281213d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(dragEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", this, array);
        ?? r112 = 0;
        boolean z17 = false;
        try {
            int action = dragEvent.getAction();
            if (action == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_STARTED");
            } else if (action == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_LOCATION");
            } else if (action == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DROP");
                android.content.ClipData clipData = dragEvent.getClipData();
                android.app.Activity g17 = q9Var.f281293d.f280113d.g();
                int i17 = z2.h.f550981a;
                android.view.DragAndDropPermissions b17 = n3.m.b(g17, dragEvent);
                n3.n nVar = b17 != null ? new n3.n(b17) : null;
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r9 r9Var = q9Var.f281293d;
                    if (itemCount > 9) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClass(r9Var.f280113d.g(), com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22572xa3a5cb26.class);
                        intent.putExtra("sharePictureTo", "friend");
                        intent.addFlags(268435456).addFlags(67108864);
                        yb5.d dVar = r9Var.f280113d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(dVar, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        dVar.a0((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                        return true;
                    }
                    int i18 = 0;
                    while (i18 < itemCount) {
                        android.content.ClipData.Item itemAt = clipData.getItemAt(i18);
                        if (itemAt == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.DragDropComponent", "item == null");
                        } else if (itemAt.getUri() != null) {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.m7 m7Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.m7(r9Var.f280113d.g(), itemAt.getUri());
                            boolean wi6 = ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).wi();
                            long k17 = com.p314xaae8f345.mm.vfs.w6.k(m7Var.f273309a);
                            long Ai = ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai();
                            if (itemCount == 1 && wi6 && k17 > Ai) {
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(r9Var.f280113d.g());
                                android.app.Activity g18 = r9Var.f280113d.g();
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                objArr[r112] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(Ai);
                                u1Var.u(g18.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ngn, objArr));
                                u1Var.n(r9Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fil));
                                u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.C13602x6871ba6());
                                u1Var.q(r112);
                            } else if (m7Var.f273310b == 0 || m7Var.f273309a == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.DragDropComponent", "get file path failed");
                            } else {
                                if (wi6) {
                                    d40.n nVar2 = (d40.n) ((e40.v) i95.n0.c(e40.v.class));
                                    nVar2.getClass();
                                    ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).getClass();
                                    if (k17 > ez.v0.f339310a.h() && k17 < nVar2.Bi()) {
                                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r9.m0(r9Var, m7Var);
                                    }
                                }
                                int i19 = m7Var.f273310b;
                                if (i19 == 3) {
                                    java.lang.String str = m7Var.f273309a;
                                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk) ((sb5.w1) r9Var.f280113d.f542241c.a(sb5.w1.class))).o0(c01.z1.a(str, r9Var.f280113d.x(), true) ? 1 : 0, 0, 0, str, "");
                                } else if (i19 != 4) {
                                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r9.m0(r9Var, m7Var);
                                } else {
                                    android.content.Intent intent2 = new android.content.Intent();
                                    intent2.setData(itemAt.getUri());
                                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jo) ((sb5.p2) r9Var.f280113d.f542241c.a(sb5.p2.class))).p0(intent2, r9Var.f280113d.x());
                                }
                            }
                        } else if (itemAt.getText() != null && itemAt.getText().length() > 0) {
                            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sk) ((sb5.f2) r9Var.f280113d.f542241c.a(sb5.f2.class))).q0(itemAt.getText().toString(), null);
                            i18++;
                            r112 = 0;
                        }
                        i18++;
                        r112 = 0;
                    }
                }
                if (nVar != null) {
                    n3.m.a(nVar.f415908a);
                }
            } else if (action == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_ENDED");
            } else {
                if (action != 5) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.DragDropComponent", "Unknown action type received by OnDragListener.");
                    yj0.a.i(z17, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                    return z17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_ENTERED");
            }
            z17 = true;
            yj0.a.i(z17, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingUI.DragDropComponent", th6, "initDragDropEvent", new java.lang.Object[0]);
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
            return false;
        }
    }
}
