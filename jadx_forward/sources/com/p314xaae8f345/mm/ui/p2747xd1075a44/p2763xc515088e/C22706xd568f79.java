package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* renamed from: com.tencent.mm.ui.widget.picker.CustomOptionPickNew */
/* loaded from: classes15.dex */
public class C22706xd568f79 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f293743d;

    /* renamed from: e, reason: collision with root package name */
    public final w51.e f293744e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f293745f;

    /* renamed from: g, reason: collision with root package name */
    public int f293746g;

    /* renamed from: h, reason: collision with root package name */
    public int f293747h;

    public C22706xd568f79(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576289ve));
        this.f293745f = context;
        this.f293744e = new w51.e(context);
        b();
    }

    public java.lang.String a() {
        this.f293744e.e();
        return this.f293743d[this.f293746g];
    }

    public void b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.d dVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.d(this);
        android.content.Context context = this.f293745f;
        t51.a aVar = new t51.a(context, dVar);
        int i17 = this.f293747h;
        u51.a aVar2 = aVar.f497240a;
        aVar2.f506317e = i17;
        aVar2.f506324l = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28);
        w51.e eVar = this.f293744e;
        aVar.a(eVar);
        m82067x6c813c5e(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc));
        m82068x8002241c(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz));
        m82066x4d90c14c(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        w51.i iVar = eVar.f524505p;
        iVar.f524514b.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize2);
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = iVar.f524514b;
        c11323x28056480.e(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        c11323x28056480.f153912d = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        c11323x28056480.invalidate();
        c11323x28056480.setBackgroundColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
    }

    public void c(int i17) {
        this.f293744e.d().m48596x940d026a(i17);
    }

    /* renamed from: getValue */
    public int m82064x754a37bb() {
        this.f293744e.e();
        return this.f293746g;
    }

    /* renamed from: getView */
    public com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 m82065xfb86a31b() {
        return this.f293744e.d();
    }

    /* renamed from: setDividerColor */
    public void m82066x4d90c14c(int i17) {
        this.f293744e.f524505p.f524514b.m48598x4d90c14c(i17);
    }

    /* renamed from: setDividerHeight */
    public void m82067x6c813c5e(float f17) {
        this.f293744e.f524505p.f524514b.m48599x6c813c5e(f17);
    }

    /* renamed from: setItemHeight */
    public void m82068x8002241c(int i17) {
        this.f293744e.f524505p.getClass();
    }

    /* renamed from: setOnValueChangedListener */
    public void m82069x5dc03d58(v51.c cVar) {
        w51.e eVar = this.f293744e;
        eVar.f524499g.f506316d = cVar;
        eVar.f524505p.f524516d = cVar;
    }

    /* renamed from: setOptionsArray */
    public void m82070x203ffbdd(java.lang.String[] strArr) {
        this.f293743d = strArr;
        this.f293744e.f(java.util.Arrays.asList(strArr));
    }

    /* renamed from: setValue */
    public void m82071x53d8522f(int i17) {
        this.f293747h = i17;
    }

    public C22706xd568f79(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576289ve), attributeSet);
        this.f293745f = context;
        this.f293744e = new w51.e(context);
        b();
    }

    public C22706xd568f79(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293745f = context;
        this.f293744e = new w51.e(context);
        b();
    }
}
