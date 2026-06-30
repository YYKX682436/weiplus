package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class w1 implements java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public long f294754d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TagSet[] f294755e;

    public w1(long j17, com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TagSet[] tagSetArr, com.p314xaae8f345.mm.vfs.v1 v1Var) {
        this.f294754d = j17;
        this.f294755e = tagSetArr;
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        long j17 = this.f294754d;
        if (j17 != 0) {
            com.p314xaae8f345.mm.vfs.C22748x3d92d33a.m82309x5a5ddf8(j17);
            this.f294754d = 0L;
        }
    }
}
