package bd1;

/* loaded from: classes7.dex */
public class a implements uh1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f100766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f100769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bd1.c f100770e;

    public a(bd1.c cVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f100770e = cVar;
        this.f100767b = str;
        this.f100768c = str2;
        this.f100769d = lVar;
    }

    public void a(int i17, java.lang.String str, int i18) {
        boolean z17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str2 = this.f100767b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateUploadTask", "onUploadResult uploadTaskId:%s, filePath:%s, result:%s, errMsg:%d, errno:%d", str2, this.f100768c, str, valueOf, valueOf2);
        bd1.c cVar = this.f100770e;
        cVar.getClass();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.h0.f509329b;
        uh1.h0 h0Var = uh1.g0.f509327a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f100769d;
        uh1.e0 a17 = h0Var.a(lVar.mo48798x74292566());
        if (a17 == null || !a17.f509313h.contains(str2)) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateUploadTask", "upload abort %s", str2);
            z17 = true;
        }
        if (z17) {
            return;
        }
        cVar.b(lVar, str2, str, i18);
    }
}
