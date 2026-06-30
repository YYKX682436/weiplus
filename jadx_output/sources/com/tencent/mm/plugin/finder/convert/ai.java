package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ai implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f102887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f102888e;

    public ai(fc2.a aVar, com.tencent.mm.plugin.finder.convert.oj ojVar) {
        this.f102887d = aVar;
        this.f102888e = ojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = ((fc2.v) this.f102887d).f260998e;
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f102888e;
        if (i17 == ojVar.f104196u || ojVar.f104198w) {
            return;
        }
        ojVar.C();
        ojVar.f104198w = true;
    }
}
