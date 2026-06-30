package c12;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.modelbase.i {
    public b(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        uq.i iVar = new uq.i();
        iVar.f430147d = sessionId;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = iVar;
        lVar.f70665b = new uq.j();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getredpacketcoverrecventrance";
        lVar.f70667d = 4074;
        p(lVar.a());
    }
}
