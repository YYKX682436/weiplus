package cc3;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.wallet_core.model.h1 {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f40480q;

    public a(java.lang.String str, boolean z17, java.lang.String str2) {
        r45.um3 um3Var = new r45.um3();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = um3Var;
        lVar.f70665b = new r45.vm3();
        lVar.f70667d = 3634;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getredpacketstory";
        lVar.f70678o = 1;
        um3Var.f387481d = str;
        um3Var.f387482e = str2;
        if (!z17) {
            lVar.f70672i = 5000;
        }
        com.tencent.mm.modelbase.o a17 = lVar.a();
        a17.setIsUserCmd(z17);
        p(a17);
        this.f40480q = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiRedPacketStoryInfo", "packet id: %s", str);
    }
}
