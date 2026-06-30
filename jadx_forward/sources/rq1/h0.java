package rq1;

/* loaded from: classes12.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final rq1.h0 f480282d = new rq1.h0();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.m54258x7fecca8();
        z17 = com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.isLibraryLoaded;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178 c12961x71d22178 = com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.f35372x4fbc8495;
            c12961x71d22178.m54255xfe168d52();
            if (c12961x71d22178.m54295xd2d8d264() == c12961x71d22178.m54286x96156fcd()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.TAG, "[HotWordSearchUtilNative] LoadTask:checked binarywordlib");
                return;
            }
            int m54271xa6c12865 = c12961x71d22178.m54271xa6c12865();
            if (m54271xa6c12865 == c12961x71d22178.m54286x96156fcd()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:success");
                return;
            }
            if (m54271xa6c12865 == c12961x71d22178.m54278x3560ee9()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:file read error");
                return;
            }
            if (m54271xa6c12865 == c12961x71d22178.m54277xd5b65920()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:file path empty");
                return;
            }
            if (m54271xa6c12865 == c12961x71d22178.m54283x26f3405d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:native object not exist");
            } else if (m54271xa6c12865 == c12961x71d22178.m54285xc56aaa56()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:source file not exist");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:unknown error");
            }
        }
    }
}
