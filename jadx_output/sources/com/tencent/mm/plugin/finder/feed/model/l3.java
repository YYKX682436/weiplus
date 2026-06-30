package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes3.dex */
public final class l3 extends com.tencent.mm.plugin.finder.feed.model.internal.IResponse {

    /* renamed from: a, reason: collision with root package name */
    public final r45.cz1 f108142a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f108143b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f108144c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108145d;

    /* renamed from: e, reason: collision with root package name */
    public int f108146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(int i17, int i18, java.lang.String str, r45.cz1 cz1Var, boolean z17, java.lang.String str2, java.lang.String str3, int i19, int i27, kotlin.jvm.internal.i iVar) {
        super(i17, i18, str);
        cz1Var = (i27 & 8) != 0 ? null : cz1Var;
        z17 = (i27 & 16) != 0 ? false : z17;
        str2 = (i27 & 32) != 0 ? "" : str2;
        str3 = (i27 & 64) != 0 ? "" : str3;
        i19 = (i27 & 128) != 0 ? 0 : i19;
        this.f108142a = cz1Var;
        this.f108143b = z17;
        this.f108144c = str2;
        this.f108145d = str3;
        this.f108146e = i19;
    }
}
