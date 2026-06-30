package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f236025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b f236026e;

    public n6(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar) {
        this.f236025d = weakReference;
        this.f236026e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90) this.f236025d.get();
        if (c16892x4a36dc90 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = c16892x4a36dc90.f235731d;
        if (activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed() || !c16892x4a36dc90.K) {
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = this.f236026e;
        java.lang.String str = bVar != null ? bVar.f299424g : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = bVar != null ? bVar.f299425h : null;
        java.lang.String str3 = str2 != null ? str2 : "";
        if (!(activityC16840x4302a3e2 instanceof android.app.Activity)) {
            activityC16840x4302a3e2 = null;
        }
        if (activityC16840x4302a3e2 == null || activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c cVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c(activityC16840x4302a3e2);
        android.view.View inflate = android.view.View.inflate(activityC16840x4302a3e2, com.p314xaae8f345.mm.R.C30864xbddafb2a.dzx, null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567838uq3);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.uq6);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567839uq4);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.t5());
        if (str3.length() > 0) {
            n11.a.b().g(str3, imageView);
        }
        textView.setText(str);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u5(cVar));
        c16892x4a36dc90.K = false;
        cVar.setContentView(inflate);
        cVar.show();
    }
}
