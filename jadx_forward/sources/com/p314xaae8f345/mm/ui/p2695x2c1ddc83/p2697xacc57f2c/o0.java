package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes5.dex */
public class o0 extends s35.b implements android.view.View.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f289091m;

    @Override // s35.b
    public void a() {
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cvz;
    }

    @Override // s35.b
    public int c() {
        return 4;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f289091m = view.findViewById(com.p314xaae8f345.mm.R.id.aez);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567712kh5);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567710kh3);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260);
        java.lang.ref.WeakReference weakReference = this.f484375g;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f79723x416541f0, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac)));
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.afd);
        view.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    @Override // s35.b
    public boolean i() {
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORAGE_PERMISSION_BANNER_1_CLOSED_FLAG_BOOLEAN_SYNC, false);
        java.lang.ref.WeakReference weakReference = this.f484375g;
        boolean z17 = b3.l.m9698x3fed0563((android.app.Activity) weakReference.get(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 && z2.h.b((android.app.Activity) weakReference.get(), "android.permission.WRITE_EXTERNAL_STORAGE") && android.os.Environment.getExternalStorageDirectory().getAbsolutePath().toLowerCase().contains("appclone");
        android.widget.LinearLayout linearLayout = this.f484376h;
        if (!o17 && z17) {
            f();
            android.view.View view = this.f289091m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(linearLayout, arrayList2.toArray(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(linearLayout, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.f484377i) {
            android.view.View view2 = this.f289091m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(linearLayout, arrayList4.toArray(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(linearLayout, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return super.i();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoragePermissionBanner", "onClick, %d", java.lang.Integer.valueOf(view.getId()));
        java.lang.ref.WeakReference weakReference = this.f484375g;
        android.app.Activity activity = (android.app.Activity) weakReference.get();
        if (view.getId() == com.p314xaae8f345.mm.R.id.f78246x851a1260) {
            db5.e1.y(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.afe), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhl), new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.n0(this));
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 25L, 1L, true);
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di((android.app.Activity) weakReference.get(), new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 33, "", "");
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 24L, 1L, true);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
