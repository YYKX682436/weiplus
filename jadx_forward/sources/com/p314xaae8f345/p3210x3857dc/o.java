package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public class o implements cy5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f301883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f301884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301885c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f301886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cy5.y f301887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f301888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301890h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f301891i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.j f301892j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f301893k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.q1 f301894l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.o1 f301895m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f301896n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f301897o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f301898p;

    public o(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, java.lang.String str, java.lang.ref.WeakReference weakReference3, cy5.y yVar, int i17, java.lang.String str2, java.lang.String str3, boolean z17, com.p314xaae8f345.p3210x3857dc.j jVar, java.util.HashMap hashMap, com.p314xaae8f345.p3210x3857dc.q1 q1Var, com.p314xaae8f345.p3210x3857dc.o1 o1Var, android.webkit.ValueCallback valueCallback, android.app.Activity activity, boolean z18) {
        this.f301883a = weakReference;
        this.f301884b = weakReference2;
        this.f301885c = str;
        this.f301886d = weakReference3;
        this.f301887e = yVar;
        this.f301888f = i17;
        this.f301889g = str2;
        this.f301890h = str3;
        this.f301891i = z17;
        this.f301892j = jVar;
        this.f301893k = hashMap;
        this.f301894l = q1Var;
        this.f301895m = o1Var;
        this.f301896n = valueCallback;
        this.f301897o = activity;
        this.f301898p = z18;
    }

    @Override // cy5.o
    public void a() {
        by5.c4.f("FileReaderXWeb", "onXWalkPluginUpdateStarted");
    }

    @Override // cy5.o
    public void b(int i17) {
        by5.c4.f("FileReaderXWeb", "onXWalkPluginUpdateProgress " + i17);
        android.app.Activity activity = (android.app.Activity) this.f301883a.get();
        android.widget.TextView textView = (android.widget.TextView) this.f301884b.get();
        if (activity == null || activity.isDestroyed() || textView == null) {
            return;
        }
        textView.setText(activity.getString(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61390xa2f31c0a) + i17 + "%");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019c  */
    @Override // cy5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r32) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.o.c(int):void");
    }
}
