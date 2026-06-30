package lq5;

/* loaded from: classes9.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f402000d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f402001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2816xed9644dc.C22935x2d5d9781 f402002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c f402003g;

    public c(int i17, com.p314xaae8f345.mm.p2816xed9644dc.C22935x2d5d9781 c22935x2d5d9781, com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c c22936xbad5951c) {
        this.f402001e = i17;
        this.f402002f = c22935x2d5d9781;
        this.f402003g = c22936xbad5951c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if ((r4 != null && r4.mo1894x7e414b06() == r6.f402003g.getShowSize() + 59) == false) goto L20;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r7, int r8) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lq5.c.mo481x4d79408f(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wepicker/RemindTimePickerRemake$1$picker$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        java.lang.Object tag = recyclerView.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        com.p314xaae8f345.mm.p2816xed9644dc.C22935x2d5d9781 c22935x2d5d9781 = this.f402002f;
        int m83474xb747914f = ((com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c) c22935x2d5d9781.f295855p.get(intValue)).m83474xb747914f();
        java.util.List list = c22935x2d5d9781.f295856q;
        if (m83474xb747914f != ((java.lang.Number) list.get(intValue)).intValue()) {
            list.set(intValue, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c) c22935x2d5d9781.f295855p.get(intValue)).m83474xb747914f()));
            int i19 = android.os.Build.VERSION.SDK_INT;
            android.os.Vibrator vibrator = c22935x2d5d9781.f295861v;
            if (i19 >= 26) {
                android.os.VibrationEffect createOneShot = android.os.VibrationEffect.createOneShot(10L, 255);
                if (vibrator != null) {
                    vibrator.vibrate(createOneShot);
                }
            } else if (vibrator != null) {
                vibrator.vibrate(10L);
            }
        }
        if (c22935x2d5d9781.getListener() != null) {
            java.util.Calendar time = c22935x2d5d9781.m83460x1cb9a550();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        }
        yj0.a.h(this, "com/tencent/mm/wepicker/RemindTimePickerRemake$1$picker$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
