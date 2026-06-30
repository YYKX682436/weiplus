package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class ub implements android.view.View.OnHoverListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.vb f284274d;

    public ub(com.p314xaae8f345.mm.ui.p2650x55bb7a46.vb vbVar) {
        this.f284274d = vbVar;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/OnHoverCompatibleHelper$CompatibleOnHoverListener", "android/view/View$OnHoverListener", "onHover", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean z17 = false;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.vb vbVar = this.f284274d;
        if (vbVar == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/OnHoverCompatibleHelper$CompatibleOnHoverListener", "android/view/View$OnHoverListener", "onHover", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.q5 q5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.q5) vbVar;
        java.lang.Object tag = view.getTag();
        if (tag == null || !(tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAvatarOnHoverHelper", "The Tag of the View is not a instance of ItemDataTag or is null.");
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
            java.lang.String str = erVar.f285439b;
            java.lang.String r17 = c01.z1.r();
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17) || r17.equals(str)) ? false : true) {
                android.content.Context context = view.getContext();
                if (q5Var.f284132d == null) {
                    android.content.res.Resources resources = context.getResources();
                    q5Var.f284136h = (int) (resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561420i0) + (resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f) * 2.0f));
                    android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569994tw, null);
                    q5Var.f284133e = inflate;
                    q5Var.f284134f = inflate.findViewById(com.p314xaae8f345.mm.R.id.oxp);
                    android.view.View findViewById = q5Var.f284133e.findViewById(com.p314xaae8f345.mm.R.id.a6n);
                    q5Var.f284135g = findViewById;
                    findViewById.setOnClickListener(q5Var);
                    q5Var.f284134f.setOnClickListener(q5Var);
                    android.view.View view2 = q5Var.f284135g;
                    android.view.View.OnTouchListener onTouchListener = q5Var.f284142q;
                    view2.setOnTouchListener(onTouchListener);
                    q5Var.f284134f.setOnTouchListener(onTouchListener);
                    db5.d5 d5Var = new db5.d5(q5Var.f284133e, -2, q5Var.f284136h, false);
                    q5Var.f284132d = d5Var;
                    d5Var.setOutsideTouchable(true);
                    android.graphics.Rect rect = new android.graphics.Rect();
                    if (context instanceof android.app.Activity) {
                        ((android.app.Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    }
                    q5Var.f284139n = rect.top;
                    android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
                        q5Var.f284137i = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561155ax);
                    } else {
                        q5Var.f284137i = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
                    }
                    q5Var.f284132d.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(16777215));
                    q5Var.f284145t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), q5Var.f284146u, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAvatarOnHoverHelper", "Create a new PopupWindow.");
                }
                db5.d5 d5Var2 = q5Var.f284132d;
                int action = motionEvent.getAction();
                if (action == 9) {
                    q5Var.f284143r = view;
                    view.setOnTouchListener(q5Var);
                    if (d5Var2.isShowing()) {
                        d5Var2.dismiss();
                    }
                    if (!q5Var.f284140o) {
                        q5Var.f284135g.setTag(erVar);
                        q5Var.f284134f.setTag(erVar);
                        android.view.View view3 = q5Var.f284135g;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "onMotionStrike", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "onMotionStrike", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view4 = q5Var.f284134f;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "onMotionStrike", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "onMotionStrike", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int[] iArr = new int[2];
                        view.getLocationInWindow(iArr);
                        int i17 = iArr[1];
                        view.getWidth();
                        int height = view.getHeight();
                        q5Var.f284138m = 0;
                        int i18 = q5Var.f284139n + q5Var.f284137i;
                        int i19 = q5Var.f284136h;
                        if (i17 > i18 + i19) {
                            q5Var.f284138m = ((-height) - i19) - 0;
                        }
                        if (q5Var.f284138m >= 0) {
                            q5Var.f284133e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c0_);
                        } else {
                            q5Var.f284133e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c0a);
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = q5Var.f284145t;
                        long j17 = q5Var.f284144s;
                        b4Var.c(j17, j17);
                    }
                } else if (action == 10) {
                    q5Var.f284140o = false;
                    q5Var.f284143r = null;
                }
                z17 = true;
            }
        }
        yj0.a.i(z17, this, "com/tencent/mm/ui/chatting/OnHoverCompatibleHelper$CompatibleOnHoverListener", "android/view/View$OnHoverListener", "onHover", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
