package com.tencent.mm.plugin.crashfix.patch.phonestateoverflow;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f96673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.telephony.PhoneStateListener f96674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$1 f96676g;

    public a(com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$1 phoneStateOverflow$1, int i17, android.telephony.PhoneStateListener phoneStateListener, java.lang.String str) {
        this.f96676g = phoneStateOverflow$1;
        this.f96673d = i17;
        this.f96674e = phoneStateListener;
        this.f96675f = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0129, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x012a, code lost:
    
        r3 = ((java.util.ArrayList) r2.f96683a).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0136, code lost:
    
        if (r3.hasNext() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0138, code lost:
    
        r4 = ((com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) r3.next()).f96681a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0142, code lost:
    
        r3 = true;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.a.run():void");
    }
}
