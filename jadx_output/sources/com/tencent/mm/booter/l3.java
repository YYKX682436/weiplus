package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public enum l3 extends com.tencent.mm.booter.o3 {
    public l3(java.lang.String str, int i17) {
        super(str, i17, null);
    }

    @Override // com.tencent.mm.booter.o3
    public ku5.c a(ku5.b bVar) {
        int i17 = this.f63541d;
        ku5.c cVar = bVar.f312551a;
        cVar.f312555b = i17 * 4;
        cVar.f312554a = i17 * 6;
        int max = (int) java.lang.Math.max(8.0f, i17 * 1.5f);
        ku5.c cVar2 = bVar.f312551a;
        cVar2.f312556c = max;
        cVar2.f312557d = 259200000L;
        cVar2.f312559f = true;
        cVar2.f312558e = tu5.i.FS_POLICY;
        cVar2.f312560g = true;
        return cVar2;
    }
}
