package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e;

/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aConfig */
/* loaded from: classes16.dex */
public class C10930x8784eb16 {

    /* renamed from: aecLevel */
    public int f29763xe875d205;

    /* renamed from: agcLevel */
    public int f29764x52424887;

    /* renamed from: ansLevel */
    public int f29765xdfdb713e;

    /* renamed from: postgain */
    public float f29766x2d27941f;

    public C10930x8784eb16() {
        int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930.LEVEL_0.f29773x6ac9171;
        this.f29763xe875d205 = i17;
        this.f29765xdfdb713e = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930.LEVEL_120.f29773x6ac9171;
        this.f29764x52424887 = i17;
        this.f29766x2d27941f = 1.0f;
    }

    /* renamed from: getAns3aLevel */
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930 m47008x1165fce6() {
        int i17 = this.f29765xdfdb713e;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930 enumC10931x3665e930 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930.LEVEL_120;
        if (i17 == enumC10931x3665e930.f29773x6ac9171) {
            return enumC10931x3665e930;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930 enumC10931x3665e9302 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930.LEVEL_100;
        if (i17 == enumC10931x3665e9302.f29773x6ac9171) {
            return enumC10931x3665e9302;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930 enumC10931x3665e9303 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930.LEVEL_60;
        if (i17 == enumC10931x3665e9303.f29773x6ac9171) {
            return enumC10931x3665e9303;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930 enumC10931x3665e9304 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930.LEVEL_30;
        return i17 == enumC10931x3665e9304.f29773x6ac9171 ? enumC10931x3665e9304 : com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.EnumC10931x3665e930.LEVEL_0;
    }
}
