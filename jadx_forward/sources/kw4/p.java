package kw4;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f394718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 f394719e;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1, android.content.Context context) {
        this.f394719e = c19252xb5f78ab1;
        this.f394718d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1.V;
        kw4.v vVar = kw4.v.NO_NET;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394719e;
        c19252xb5f78ab1.T = vVar;
        c19252xb5f78ab1.i();
        android.content.Context context = this.f394718d;
        c19252xb5f78ab1.o(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7r), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80), null);
    }
}
