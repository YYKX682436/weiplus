package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class x3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f227227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227228b;

    public x3(boolean z17, java.lang.String str) {
        this.f227227a = z17;
        this.f227228b = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n5
    public boolean a() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n5
    public int b(com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        r45.ex3 ex3Var = (r45.ex3) oVar.f152244b.f152233a;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjq);
        java.lang.String format = this.f227227a ? java.lang.String.format("{\"retcode\":0,\"retmsg\":\"ok\",\"sendId\":\"1000039401201911277000281247819\",\"wishing\":\"%s\",\"isSender\":0,\"receiveStatus\":0,\"hbStatus\":2,\"statusMess\":\"给你发了一个红包\",\"hbType\":0,\"watermark\":\"\",\"scenePicSwitch\":1,\"preStrainFlag\":1,\"agree_duty\":{\"title\":\"\",\"service_protocol_wording\":\"\",\"service_protocol_url\":\"\",\"button_wording\":\"\",\"delay_expired_time\":0,\"agreed_flag\":1},\"sendUserName\":\"1@fackuser\",\"timingIdentifier\":\"BC1985F636763728826336B3251529F4\",\"showYearExpression\":1,\"expression_md5\":\"%s\",\"expression_type\":\"2\",\"showRecNormalExpression\":1}", string, this.f227228b) : java.lang.String.format("{\"retcode\":0,\"retmsg\":\"ok\",\"sendId\":\"1000039401201911277000281247819\",\"wishing\":\"%s\",\"isSender\":0,\"receiveStatus\":0,\"hbStatus\":2,\"statusMess\":\"给你发了一个红包\",\"hbType\":0,\"watermark\":\"\",\"scenePicSwitch\":1,\"preStrainFlag\":1,\"agree_duty\":{\"title\":\"\",\"service_protocol_wording\":\"\",\"service_protocol_url\":\"\",\"button_wording\":\"\",\"delay_expired_time\":0,\"agreed_flag\":1},\"sendUserName\":\"1@fackuser\",\"timingIdentifier\":\"BC1985F636763728826336B3251529F4\",\"showYearExpression\":1,\"expression_md5\":\"\",\"showRecNormalExpression\":1}", string);
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(format.getBytes());
        ex3Var.f455314d = cu5Var;
        l0Var.mo804x5f9cdc6f(0, 0, 0, "", oVar, null);
        return 0;
    }
}
