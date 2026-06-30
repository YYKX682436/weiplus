package mf1;

/* loaded from: classes7.dex */
public class a implements mf1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf1.k f407555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mf1.h f407556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf1.c f407558e;

    public a(mf1.c cVar, java.lang.String str, mf1.k kVar, mf1.h hVar, java.lang.String str2) {
        this.f407558e = cVar;
        this.f407554a = str;
        this.f407555b = kVar;
        this.f407556c = hVar;
        this.f407557d = str2;
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketError url is %s ,error is %s,taskId=%s", this.f407557d, str, this.f407554a);
        mf1.c cVar = this.f407558e;
        mf1.k kVar = this.f407555b;
        cVar.i(kVar);
        cVar.h(kVar);
        ((yc1.o) this.f407556c).c("exception " + str);
    }
}
