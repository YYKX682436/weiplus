package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f70297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(androidx.paging.compose.e eVar) {
        super(1);
        this.f70297d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) this.f70297d.b(intValue);
        return (m5Var == null || (str = m5Var.f70077a) == null) ? java.lang.Integer.valueOf(intValue) : str;
    }
}
