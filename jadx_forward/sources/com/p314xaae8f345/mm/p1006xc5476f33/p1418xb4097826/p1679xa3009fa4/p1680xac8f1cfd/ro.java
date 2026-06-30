package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes5.dex */
public final class ro extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f217351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo f217352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f217354g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f217355h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo uoVar, android.view.View view, java.lang.String str2, boolean z17) {
        super(0);
        this.f217351d = str;
        this.f217352e = uoVar;
        this.f217353f = view;
        this.f217354g = str2;
        this.f217355h = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMagicEmojiUIC", "trigger " + this.f217351d);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217352e.f217681d;
        java.lang.String str = this.f217351d;
        concurrentHashMap.put(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qo(this.f217353f, new wp0.b(str, java.lang.System.currentTimeMillis(), this.f217354g, 1L, new android.graphics.RectF(), 0L, false, "", "", 0, "", "")));
        java.util.ArrayList arrayList = this.f217352e.f217682e;
        java.lang.String str2 = this.f217351d;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (str2.compareTo((java.lang.String) it.next()) > 0) {
                break;
            }
            i17++;
        }
        if (i17 == -1) {
            this.f217352e.f217682e.add(this.f217351d);
        } else {
            this.f217352e.f217682e.add(i17, this.f217351d);
        }
        if (!this.f217352e.f217686i) {
            this.f217352e.f217686i = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMagicEmojiUIC", "start trigger");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo uoVar = this.f217352e;
            long j17 = this.f217355h ? 700L : 0L;
            uoVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.so soVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.so(uoVar);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(soVar, j17);
        }
        return jz5.f0.f384359a;
    }
}
