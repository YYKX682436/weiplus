package i33;

/* loaded from: classes10.dex */
public final class c0 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369701f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f369702g;

    /* renamed from: h, reason: collision with root package name */
    public int f369703h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369701f = "MicroMsg.AlbumQueryPermissionUIC";
    }

    public final void W6() {
        boolean wi6 = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).wi(m80379x76847179());
        java.lang.String str = this.f369701f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkBottomPermissionTipsForOnlyCanShowMediaPart: needShow=" + wi6);
        if (!wi6) {
            android.view.View view = this.f369702g;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f369702g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init bottomGuidePermissionTipsView");
            android.view.ViewStub viewStub = (android.view.ViewStub) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s_2);
            if (viewStub != null) {
                viewStub.setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569527b44);
                android.view.View inflate = viewStub.inflate();
                this.f369702g = inflate;
                if (inflate != null) {
                    inflate.setOnClickListener(new i33.b0(this));
                }
            }
        }
        int i17 = this.f369703h;
        if (i17 != 0) {
            this.f369703h = i17;
            android.view.View view2 = this.f369702g;
            if (view2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i17;
                view2.setLayoutParams(marginLayoutParams);
            }
        }
        android.view.View view3 = this.f369702g;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (b3.l.m9698x3fed0563(r3, "android.permission.READ_MEDIA_VIDEO") == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (b3.l.m9698x3fed0563(r3, "android.permission.READ_MEDIA_IMAGES") == 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean X6(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            r1 = 0
            r2 = 34
            java.lang.Class<tb0.j> r3 = tb0.j.class
            r4 = 1
            if (r7 == r4) goto L42
            r5 = 2
            if (r7 == r5) goto L12
            boolean r7 = r6.Z6()
            goto L73
        L12:
            i95.m r7 = i95.n0.c(r3)
            tb0.j r7 = (tb0.j) r7
            android.app.Activity r3 = r6.m80379x76847179()
            sb0.f r7 = (sb0.f) r7
            r7.getClass()
            if (r3 != 0) goto L25
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
        L25:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 >= r2) goto L2a
            goto L72
        L2a:
            android.content.pm.ApplicationInfo r7 = r3.getApplicationInfo()
            int r7 = r7.targetSdkVersion
            if (r7 >= r2) goto L33
            goto L72
        L33:
            int r7 = b3.l.m9698x3fed0563(r3, r0)
            if (r7 != 0) goto L72
            java.lang.String r7 = "android.permission.READ_MEDIA_VIDEO"
            int r7 = b3.l.m9698x3fed0563(r3, r7)
            if (r7 == 0) goto L72
            goto L71
        L42:
            i95.m r7 = i95.n0.c(r3)
            tb0.j r7 = (tb0.j) r7
            android.app.Activity r3 = r6.m80379x76847179()
            sb0.f r7 = (sb0.f) r7
            r7.getClass()
            if (r3 != 0) goto L55
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
        L55:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 >= r2) goto L5a
            goto L72
        L5a:
            android.content.pm.ApplicationInfo r7 = r3.getApplicationInfo()
            int r7 = r7.targetSdkVersion
            if (r7 >= r2) goto L63
            goto L72
        L63:
            int r7 = b3.l.m9698x3fed0563(r3, r0)
            if (r7 != 0) goto L72
            java.lang.String r7 = "android.permission.READ_MEDIA_IMAGES"
            int r7 = b3.l.m9698x3fed0563(r3, r7)
            if (r7 == 0) goto L72
        L71:
            r1 = r4
        L72:
            r7 = r1
        L73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i33.c0.X6(int):boolean");
    }

    public final void Y6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) m158354x19263085 : null;
        if (activityC15653x403456cd != null) {
            boolean B7 = activityC15653x403456cd.B7();
            java.lang.String str = this.f369701f;
            if (!B7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkPermissionAndQuery: not hadMediaStorage");
                activityC15653x403456cd.U7(java.lang.Boolean.TRUE);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkPermissionAndQuery: hadMediaStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.h9a);
            activityC15653x403456cd.S7(c15655x4db85b14 != null ? c15655x4db85b14.c(0) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPreviewUI", "showGalleryAfterPermissionRequestSuccess: ");
            activityC15653x403456cd.C7();
            activityC15653x403456cd.Q7();
            t23.p0.k().d();
            activityC15653x403456cd.P7();
        }
    }

    public final boolean Z6() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity m80379x76847179 = m80379x76847179();
        ((sb0.f) jVar).getClass();
        return zo.e.b(m80379x76847179);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (!Z6()) {
            android.view.View view = this.f369702g;
            if (view != null && view.getVisibility() == 0) {
                android.view.View view2 = this.f369702g;
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Y6();
                return;
            }
        }
        if (mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.kcc).getVisibility() == 0) {
            Y6();
        }
    }
}
