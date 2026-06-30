package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.CategoryTipView */
/* loaded from: classes4.dex */
public class C22291x3eba42e2 extends android.widget.RelativeLayout implements ze4.e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f287866h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f287867d;

    /* renamed from: e, reason: collision with root package name */
    public int f287868e;

    /* renamed from: f, reason: collision with root package name */
    public long f287869f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f287870g;

    public C22291x3eba42e2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f287867d = null;
        this.f287868e = 0;
        this.f287869f = 0L;
        this.f287870g = "";
        b();
    }

    public void a(int i17) {
        this.f287868e = i17;
        if (!c()) {
            setVisibility(8);
            this.f287867d.setVisibility(8);
            return;
        }
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("StoryShouldShowEntraceInFavorFriend", 1);
        if (b17 == 1 && (i17 & 1) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CategoryTipView", "%s showStoryCategory has new story %s", this, java.lang.Integer.valueOf(b17));
            setVisibility(0);
            this.f287867d.setVisibility(0);
            android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79571x9e0fd951);
            drawable.setBounds(0, 0, i65.a.b(getContext(), 20), i65.a.b(getContext(), 20));
            this.f287867d.setCompoundDrawables(null, null, drawable, null);
            this.f287867d.invalidate();
            return;
        }
        if (b17 != 1 || (i17 & 2) == 0) {
            setVisibility(8);
            this.f287867d.setVisibility(8);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CategoryTipView", "%s showStoryCategory has story %s", this, java.lang.Integer.valueOf(b17));
        setVisibility(0);
        this.f287867d.setVisibility(0);
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80231x57f66527, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        e17.setBounds(0, 0, i65.a.b(getContext(), 20), i65.a.b(getContext(), 20));
        this.f287867d.setCompoundDrawables(null, null, e17, null);
        this.f287867d.invalidate();
    }

    public final void b() {
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569519dc, (android.view.ViewGroup) this, true);
        this.f287867d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cfz);
        setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.m0(this));
        ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
        java.util.List list = ef4.i.f333979a;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        java.util.List list2 = ef4.i.f333979a;
        if (list2.contains(weakReference)) {
            return;
        }
        list2.add(weakReference);
    }

    public final boolean c() {
        java.lang.Object tag = getTag();
        return tag != null && (tag instanceof java.lang.Integer) && ((java.lang.Integer) tag).intValue() == 32;
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        if (i17 == 0) {
            this.f287870g = com.p314xaae8f345.mm.ui.x2.a(java.lang.String.valueOf(6L));
        }
    }

    public C22291x3eba42e2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f287867d = null;
        this.f287868e = 0;
        this.f287869f = 0L;
        this.f287870g = "";
        b();
    }
}
