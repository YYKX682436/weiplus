package p012xc85e97e9.p114xa324943e.p115xd1075a44;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: POSITION_NONE */
    public static final int f3741xfb0b288e = -2;

    /* renamed from: POSITION_UNCHANGED */
    public static final int f3742xd0ee5a45 = -1;

    /* renamed from: mObservable */
    private final android.database.DataSetObservable f3743xdc6ded90 = new android.database.DataSetObservable();

    /* renamed from: mViewPagerObserver */
    private android.database.DataSetObserver f3744x9d05e427;

    @java.lang.Deprecated
    /* renamed from: destroyItem */
    public void m8336x89d2022d(android.view.View view, int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: destroyItem */
    public abstract void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj);

    @java.lang.Deprecated
    /* renamed from: finishUpdate */
    public void m8337xa949b73c(android.view.View view) {
    }

    /* renamed from: getCount */
    public abstract int mo8338x7444f759();

    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        return -1;
    }

    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        return null;
    }

    /* renamed from: getPageWidth */
    public float m8341x33a68dc1(int i17) {
        return 1.0f;
    }

    @java.lang.Deprecated
    /* renamed from: instantiateItem */
    public java.lang.Object m8342x8d1aed1d(android.view.View view, int i17) {
        throw new java.lang.UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: instantiateItem */
    public abstract java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17);

    /* renamed from: isViewFromObject */
    public abstract boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj);

    /* renamed from: notifyDataSetChanged */
    public void mo8343xced61ae5() {
        synchronized (this) {
            android.database.DataSetObserver dataSetObserver = this.f3744x9d05e427;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f3743xdc6ded90.notifyChanged();
    }

    /* renamed from: registerDataSetObserver */
    public void m8344x4b262a2b(android.database.DataSetObserver dataSetObserver) {
        this.f3743xdc6ded90.registerObserver(dataSetObserver);
    }

    /* renamed from: restoreState */
    public void mo7746x61a06aa3(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
    }

    /* renamed from: saveState */
    public android.os.Parcelable mo7747xa507914() {
        return null;
    }

    @java.lang.Deprecated
    /* renamed from: setPrimaryItem */
    public void m8345x3c80e673(android.view.View view, int i17, java.lang.Object obj) {
    }

    /* renamed from: setViewPagerObserver */
    public void m8346x2eeef0d2(android.database.DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f3744x9d05e427 = dataSetObserver;
        }
    }

    @java.lang.Deprecated
    /* renamed from: startUpdate */
    public void m8347x93ef97cb(android.view.View view) {
    }

    /* renamed from: unregisterDataSetObserver */
    public void m8348xfde4bf72(android.database.DataSetObserver dataSetObserver) {
        this.f3743xdc6ded90.unregisterObserver(dataSetObserver);
    }

    /* renamed from: finishUpdate */
    public void mo7742xa949b73c(android.view.ViewGroup viewGroup) {
        m8337xa949b73c((android.view.View) viewGroup);
    }

    /* renamed from: setPrimaryItem */
    public void mo7748x3c80e673(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        m8345x3c80e673((android.view.View) viewGroup, i17, obj);
    }

    /* renamed from: startUpdate */
    public void mo7749x93ef97cb(android.view.ViewGroup viewGroup) {
        m8347x93ef97cb((android.view.View) viewGroup);
    }
}
