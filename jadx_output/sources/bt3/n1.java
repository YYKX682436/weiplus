package bt3;

/* loaded from: classes9.dex */
public class n1 implements bt3.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zs3.y f24356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn.h f24357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bt3.o1 f24358c;

    public n1(bt3.o1 o1Var, zs3.y yVar, dn.h hVar) {
        this.f24358c = o1Var;
        this.f24356a = yVar;
        this.f24357b = hVar;
    }

    @Override // bt3.j0
    public void a(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgCDNService", "summersafecdn NetSceneCheckMd5 callback [%d, %d], [%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        bt3.o1 o1Var = this.f24358c;
        zs3.y yVar = this.f24356a;
        if (i17 != 4 || i18 != 102) {
            yVar.field_cdnKey = str;
            yVar.field_cdnUrl = this.f24357b.field_fileId;
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).update(yVar, dm.i4.COL_LOCALID);
            o1Var.f24364d.a();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgCDNService", "summersafecdn NetSceneCheckMd5 MM_ERR_GET_AESKEY_FAILED old status[%d, %d, %d]", java.lang.Integer.valueOf(yVar.field_status), java.lang.Long.valueOf(yVar.field_offset), java.lang.Long.valueOf(yVar.field_totalLen));
        yVar.field_offset = 0L;
        yVar.field_totalLen = 0L;
        yVar.field_status = 0;
        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).update(yVar, dm.i4.COL_LOCALID);
        o1Var.f24364d.c(yVar, false);
    }
}
