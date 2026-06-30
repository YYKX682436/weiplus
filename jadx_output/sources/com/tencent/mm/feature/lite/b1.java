package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67124e;

    public b1(com.tencent.mm.feature.lite.i iVar, java.lang.String str) {
        this.f67124e = iVar;
        this.f67123d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.feature.lite.i.Bi(this.f67124e, this.f67123d);
    }
}
