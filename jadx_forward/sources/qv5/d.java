package qv5;

/* loaded from: classes13.dex */
public final class d implements com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f448576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f448577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f448578c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable[] f448579d;

    public d(boolean[] zArr, java.util.List list, java.lang.Throwable[] thArr) {
        this.f448577b = zArr;
        this.f448578c = list;
        this.f448579d = thArr;
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback
    /* renamed from: onFailed */
    public void mo104489x428b6afc(java.io.File file, java.io.File file2, java.lang.Throwable th6) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DexDiffPatchInternal", "fail to parallel optimize dex %s use time %d", file.getPath(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f448576a));
        this.f448578c.add(file);
        this.f448579d[0] = th6;
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback
    /* renamed from: onStart */
    public void mo104490xb05099c3(java.io.File file, java.io.File file2) {
        this.f448576a = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DexDiffPatchInternal", "start to parallel optimize dex %s, size: %d", file.getPath(), java.lang.Long.valueOf(file.length()));
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback
    /* renamed from: onSuccess */
    public void mo104491xe05b4124(java.io.File file, java.io.File file2, java.io.File file3) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DexDiffPatchInternal", "success to parallel optimize dex %s, opt file:%s, opt file size: %d, use time %d", file.getPath(), file3.getPath(), java.lang.Long.valueOf(file3.length()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f448576a));
        if (file3.exists()) {
            return;
        }
        synchronized (this.f448577b) {
            this.f448577b[0] = true;
        }
    }
}
