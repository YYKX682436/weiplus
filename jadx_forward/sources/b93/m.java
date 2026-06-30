package b93;

/* loaded from: classes16.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f100130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f100131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f100132f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f100133g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f100134h;

    public m(long j17, long j18, long j19, long j27, long j28) {
        this.f100130d = j17;
        this.f100131e = j18;
        this.f100132f = j19;
        this.f100133g = j27;
        this.f100134h = j28;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6381x16791626 c6381x16791626 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6381x16791626();
        long j17 = this.f100130d;
        c6381x16791626.f137281d = j17;
        long j18 = this.f100131e;
        c6381x16791626.f137282e = j18;
        long j19 = this.f100132f;
        c6381x16791626.f137283f = j19;
        long j27 = this.f100133g;
        c6381x16791626.f137284g = j27;
        long j28 = this.f100134h;
        c6381x16791626.f137285h = j28;
        c6381x16791626.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.LabelUtils", "24176 setSource = " + j17 + ",setAction = " + j18 + ",setOperate_label_cnt = " + j19 + ",setAdd_member_cnt = " + j27 + ",setRemove_member_cnt = " + j28);
    }
}
