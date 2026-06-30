package co0;

/* loaded from: classes3.dex */
public final class j implements fo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co0.s f43720a;

    public j(co0.s sVar) {
        this.f43720a = sVar;
    }

    @Override // fo0.b
    public java.lang.String a() {
        mm2.c1 c1Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.uo1 liveDesc;
        fn0.g gVar = fn0.g.f264195a;
        if (fn0.g.f264196b == null) {
            return "";
        }
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        java.lang.String string = (c1Var2 == null || (finderObject2 = c1Var2.f328846n) == null || (objectDesc2 = finderObject2.getObjectDesc()) == null || (liveDesc = objectDesc2.getLiveDesc()) == null) ? null : liveDesc.getString(0);
        if ((string == null || string.length() == 0) && ((c1Var = (mm2.c1) efVar.i(mm2.c1.class)) == null || (finderObject = c1Var.f328846n) == null || (objectDesc = finderObject.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null || (string = finderMedia.getUrl()) == null)) {
            string = "";
        }
        return string == null ? "" : string;
    }

    @Override // fo0.b
    public void a1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "getCurWindowPlayer.pausePlay");
        mn0.b0 b0Var = this.f43720a.R1.f282409a;
        if (b0Var != null) {
            mn0.b0.M(b0Var, false, 1, null);
        }
    }

    @Override // fo0.b
    public android.graphics.Bitmap b() {
        mn0.b0 b0Var;
        co0.s sVar = this.f43720a;
        if (sVar.D.e() || (b0Var = sVar.R1.f282409a) == null) {
            return null;
        }
        return ((mn0.y) b0Var).i(android.graphics.Bitmap.Config.ARGB_4444, false, 1.0d);
    }

    @Override // fo0.b
    public boolean isPlaying() {
        mn0.b0 b0Var = this.f43720a.R1.f282409a;
        return b0Var != null && ((mn0.y) b0Var).b(false);
    }

    @Override // fo0.b
    public void u() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "getCurWindowPlayer.resumePlay");
        mn0.b0 b0Var = this.f43720a.R1.f282409a;
        if (b0Var != null) {
            ((mn0.y) b0Var).y();
        }
    }
}
