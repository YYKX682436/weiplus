package az2;

/* loaded from: classes2.dex */
public final class b extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String topic, int i17, java.lang.Long l17, com.tencent.mm.protobuf.g gVar, r45.xu2 xu2Var, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(topic, "topic");
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, java.lang.Integer.valueOf(i17));
        na1Var.set(4, topic);
        na1Var.set(2, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        na1Var.set(10, xu2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = na1Var;
        lVar.f70667d = 817;
        lVar.f70665b = new r45.oa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergettopiclist";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + topic + ", " + l17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.oa1 resp = (r45.oa1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetTopicFeed", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
