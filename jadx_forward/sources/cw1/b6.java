package cw1;

/* loaded from: classes5.dex */
public final class b6 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Calendar f304357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long[] f304358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f304359c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView[] f304360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 f304361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f304362f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304363g;

    public b6(java.util.Calendar calendar, long[] jArr, int i17, android.widget.TextView[] textViewArr, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9, android.widget.Button button, android.widget.TextView textView) {
        this.f304357a = calendar;
        this.f304358b = jArr;
        this.f304359c = i17;
        this.f304360d = textViewArr;
        this.f304361e = c13121x39a05fa9;
        this.f304362f = button;
        this.f304363g = textView;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
    /* renamed from: onResult */
    public final void mo26477x57429edc(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            this.f304357a.set(i17, i18 - 1, i19, 0, 0, 0);
            java.util.Calendar calendar = this.f304357a;
            calendar.clear(14);
            long timeInMillis = calendar.getTimeInMillis();
            int i27 = this.f304359c;
            if (i27 != 0) {
                timeInMillis = (long) java.lang.Math.min(java.lang.System.currentTimeMillis(), timeInMillis + 86399999);
            }
            long[] jArr = this.f304358b;
            jArr[i27] = timeInMillis;
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9.c(jArr, this.f304360d, this.f304361e, this.f304362f, this.f304363g);
        }
    }
}
