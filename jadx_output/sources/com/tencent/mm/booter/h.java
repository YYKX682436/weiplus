package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class h implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.i f63375d;

    public h(com.tencent.mm.booter.i iVar) {
        this.f63375d = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f63375d.f63396d.f63248s.unLock();
        return false;
    }
}
