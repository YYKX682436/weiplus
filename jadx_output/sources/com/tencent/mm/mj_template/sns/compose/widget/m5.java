package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public abstract class m5 {

    /* renamed from: d, reason: collision with root package name */
    public static int f70076d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f70077a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.mj_template.sns.compose.widget.r f70078b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70079c;

    public m5(java.lang.String str, com.tencent.mm.mj_template.sns.compose.widget.r rVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        rVar = (i17 & 2) != 0 ? new com.tencent.mm.mj_template.sns.compose.widget.r(false, str, "MicroMsg.SnsTemplateListData.SelectedState") : rVar;
        z17 = (i17 & 4) != 0 ? true : z17;
        this.f70077a = str;
        this.f70078b = rVar;
        this.f70079c = z17;
    }
}
