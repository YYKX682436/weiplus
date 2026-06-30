package zu3;

/* loaded from: classes10.dex */
public final class i implements zu3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 f557342a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621) {
        this.f557342a = c17058xaee30621;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zu3.f
    public void a(android.view.View itemView, android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621 = this.f557342a;
        if (c17058xaee30621.L) {
            c17058xaee30621.g();
            int actionMasked = event.getActionMasked();
            java.lang.Runnable runnable = c17058xaee30621.C;
            if (actionMasked == 0) {
                c17058xaee30621.removeCallbacks(runnable);
                if ((itemView instanceof zu3.z) || (itemView instanceof zu3.c0)) {
                    c17058xaee30621.h(itemView, false);
                    return;
                } else {
                    c17058xaee30621.h(itemView, true);
                    return;
                }
            }
            android.view.ViewGroup viewGroup = c17058xaee30621.f237663s;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    boolean z17 = itemView instanceof zu3.c0;
                    if (!(z17 || (itemView instanceof zu3.z) || c17058xaee30621.f237658J != 0) && (itemView instanceof cw3.s)) {
                        float[] mo122946xf6c2c98d = ((cw3.s) itemView).mo122946xf6c2c98d();
                        float f17 = mo122946xf6c2c98d[0];
                        float f18 = mo122946xf6c2c98d[1];
                        float f19 = mo122946xf6c2c98d[2];
                        float f27 = mo122946xf6c2c98d[3];
                        android.graphics.Rect rect = lt3.n.f402795c;
                        boolean z18 = f17 <= ((float) rect.left);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa5 = c17058xaee30621.f237664t;
                        if (c17041xb2d1daa5 != null) {
                            c17041xb2d1daa5.setVisibility(z18 ? 0 : 4);
                        }
                        boolean z19 = f18 <= ((float) rect.top);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa52 = c17058xaee30621.f237665u;
                        if (c17041xb2d1daa52 != null) {
                            c17041xb2d1daa52.setVisibility(z19 ? 0 : 4);
                        }
                        boolean z27 = f19 >= ((float) rect.right);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa53 = c17058xaee30621.f237666v;
                        if (c17041xb2d1daa53 != null) {
                            c17041xb2d1daa53.setVisibility(z27 ? 0 : 4);
                        }
                        boolean z28 = f27 >= ((float) rect.bottom);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa54 = c17058xaee30621.f237667w;
                        if (c17041xb2d1daa54 != null) {
                            c17041xb2d1daa54.setVisibility(z28 ? 0 : 4);
                        }
                    }
                    if (z17 || (itemView instanceof zu3.z)) {
                        return;
                    }
                    int pointerCount = event.getPointerCount();
                    float f28 = 0.0f;
                    float f29 = 0.0f;
                    for (int i17 = 0; i17 < pointerCount; i17++) {
                        f28 += event.getY(i17);
                        f29 += event.getX(i17);
                    }
                    float f37 = pointerCount;
                    float f38 = f29 / f37;
                    if (viewGroup.getTop() > 0 && f28 / f37 > ((float) viewGroup.getTop()) && ((float) viewGroup.getLeft()) < f38 && ((float) viewGroup.getRight()) > f38) {
                        c17058xaee30621.d(true);
                        if (c17058xaee30621.f237669y == null) {
                            c17058xaee30621.f237669y = itemView;
                            itemView.animate().alpha(0.5f).setDuration(100L).start();
                        }
                    } else {
                        c17058xaee30621.d(false);
                        if (c17058xaee30621.f237669y != null) {
                            c17058xaee30621.f237669y = null;
                            itemView.animate().alpha(1.0f).setDuration(100L).start();
                        }
                    }
                    viewGroup.setVisibility(0);
                    yz5.l lVar = c17058xaee30621.deleteStateListener;
                    if (lVar != null) {
                        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    return;
                }
            }
            boolean z29 = itemView instanceof zu3.l;
            boolean z37 = itemView instanceof zu3.b0;
            boolean z38 = itemView instanceof zu3.z;
            if (c17058xaee30621.f237669y != null) {
                c17058xaee30621.post(new zu3.h(c17058xaee30621, itemView));
            } else if (c17058xaee30621.B != null) {
                c17058xaee30621.postDelayed(runnable, 1500L);
            }
            viewGroup.setVisibility(8);
            yz5.l lVar2 = c17058xaee30621.deleteStateListener;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa55 = c17058xaee30621.f237664t;
            if (c17041xb2d1daa55 != null) {
                c17041xb2d1daa55.setVisibility(4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa56 = c17058xaee30621.f237665u;
            if (c17041xb2d1daa56 != null) {
                c17041xb2d1daa56.setVisibility(4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa57 = c17058xaee30621.f237666v;
            if (c17041xb2d1daa57 != null) {
                c17041xb2d1daa57.setVisibility(4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17041xb2d1daa5 c17041xb2d1daa58 = c17058xaee30621.f237667w;
            if (c17041xb2d1daa58 == null) {
                return;
            }
            c17041xb2d1daa58.setVisibility(4);
        }
    }
}
