package com.tencent.mm.plugin.appbrand.luggage.customize;

@j95.b
/* loaded from: classes12.dex */
public final class w extends i95.w implements kl1.h {
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    @Override // kl1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.text.Spannable Oh(android.content.Context r18, android.text.Spannable r19, int r20, com.tencent.mm.pointers.PInt r21, android.text.Spannable.Factory r22) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.luggage.customize.w.Oh(android.content.Context, android.text.Spannable, int, com.tencent.mm.pointers.PInt, android.text.Spannable$Factory):android.text.Spannable");
    }

    @Override // kl1.h
    public android.text.SpannableString S9(android.content.Context context, java.lang.CharSequence charSequence, float f17) {
        ((com.tencent.mm.feature.emoji.gb) ((com.tencent.mm.feature.emoji.api.c7) i95.n0.c(com.tencent.mm.feature.emoji.api.c7.class))).getClass();
        return com.tencent.mm.smiley.x1.Di().Ri(charSequence, true);
    }

    @Override // kl1.h
    public kl1.g v2(int i17) {
        ((com.tencent.mm.feature.emoji.b1) ((com.tencent.mm.feature.emoji.api.d6) i95.n0.c(com.tencent.mm.feature.emoji.api.d6.class))).getClass();
        kotlin.jvm.internal.o.f(com.tencent.mm.smiley.g.b(), "getInstance(...)");
        boolean z17 = com.tencent.mm.smiley.q0.f193336d;
        com.tencent.mm.smiley.b2 e17 = com.tencent.mm.smiley.l0.f193307a.e(i17);
        if (e17 == null) {
            return null;
        }
        kl1.g gVar = new kl1.g();
        int[] iArr = e17.f193222c;
        if (iArr.length > 0) {
            gVar.f308747a = iArr[0];
        }
        if (iArr.length > 1) {
            gVar.f308748b = iArr[1];
        }
        ((com.tencent.mm.feature.emoji.b1) ((com.tencent.mm.feature.emoji.api.d6) i95.n0.c(com.tencent.mm.feature.emoji.api.d6.class))).getClass();
        kotlin.jvm.internal.o.f(com.tencent.mm.smiley.g.b(), "getInstance(...)");
        return gVar;
    }
}
