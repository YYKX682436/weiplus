package p012xc85e97e9.p023xae79c325.p061xedfae76a;

/* renamed from: androidx.camera.lifecycle.AutoValue_LifecycleCameraRepository_Key */
/* loaded from: classes14.dex */
final class C1040xe7306a1c extends p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key {

    /* renamed from: cameraId */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId f2613xf7159720;

    /* renamed from: lifecycleOwner */
    private final p012xc85e97e9.p093xedfae76a.y f2614xa7302d69;

    public C1040xe7306a1c(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId cameraId) {
        if (yVar == null) {
            throw new java.lang.NullPointerException("Null lifecycleOwner");
        }
        this.f2614xa7302d69 = yVar;
        if (cameraId == null) {
            throw new java.lang.NullPointerException("Null cameraId");
        }
        this.f2613xf7159720 = cameraId;
    }

    /* renamed from: equals */
    public boolean m6885xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key key = (p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key) obj;
        return this.f2614xa7302d69.equals(key.mo6887x95c7fa5f()) && this.f2613xf7159720.equals(key.mo6886x72efd496());
    }

    @Override // p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key
    /* renamed from: getCameraId */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId mo6886x72efd496() {
        return this.f2613xf7159720;
    }

    @Override // p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key
    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y mo6887x95c7fa5f() {
        return this.f2614xa7302d69;
    }

    /* renamed from: hashCode */
    public int m6888x8cdac1b() {
        return ((this.f2614xa7302d69.hashCode() ^ 1000003) * 1000003) ^ this.f2613xf7159720.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m6889x9616526c() {
        return "Key{lifecycleOwner=" + this.f2614xa7302d69 + ", cameraId=" + this.f2613xf7159720 + "}";
    }
}
