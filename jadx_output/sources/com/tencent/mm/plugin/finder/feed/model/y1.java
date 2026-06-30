package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class y1 extends com.tencent.mm.plugin.finder.feed.model.internal.IResponse {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f108471a;

    /* renamed from: b, reason: collision with root package name */
    public int f108472b;

    /* renamed from: c, reason: collision with root package name */
    public r45.jt2 f108473c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f108474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(int i17, int i18, java.lang.String str, java.lang.String tipsWording, r45.ab1 ab1Var, java.lang.String str2, int i19, r45.jt2 jt2Var, com.tencent.mm.protobuf.g gVar, int i27, kotlin.jvm.internal.i iVar) {
        super(i17, i18, str);
        i19 = (i27 & 64) != 0 ? 1000 : i19;
        jt2Var = (i27 & 128) != 0 ? null : jt2Var;
        gVar = (i27 & 256) != 0 ? null : gVar;
        kotlin.jvm.internal.o.g(tipsWording, "tipsWording");
        this.f108471a = tipsWording;
        this.f108472b = i19;
        this.f108473c = jt2Var;
        this.f108474d = gVar;
    }
}
