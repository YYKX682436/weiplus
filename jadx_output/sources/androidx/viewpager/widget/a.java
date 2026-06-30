package androidx.viewpager.widget;

/* loaded from: classes15.dex */
public abstract class a {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private final android.database.DataSetObservable mObservable = new android.database.DataSetObservable();
    private android.database.DataSetObserver mViewPagerObserver;

    @java.lang.Deprecated
    public void destroyItem(android.view.View view, int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj);

    @java.lang.Deprecated
    public void finishUpdate(android.view.View view) {
    }

    public abstract int getCount();

    public int getItemPosition(java.lang.Object obj) {
        return -1;
    }

    public java.lang.CharSequence getPageTitle(int i17) {
        return null;
    }

    public float getPageWidth(int i17) {
        return 1.0f;
    }

    @java.lang.Deprecated
    public java.lang.Object instantiateItem(android.view.View view, int i17) {
        throw new java.lang.UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17);

    public abstract boolean isViewFromObject(android.view.View view, java.lang.Object obj);

    public void notifyDataSetChanged() {
        synchronized (this) {
            android.database.DataSetObserver dataSetObserver = this.mViewPagerObserver;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.mObservable.notifyChanged();
    }

    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver(dataSetObserver);
    }

    public void restoreState(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
    }

    public android.os.Parcelable saveState() {
        return null;
    }

    @java.lang.Deprecated
    public void setPrimaryItem(android.view.View view, int i17, java.lang.Object obj) {
    }

    public void setViewPagerObserver(android.database.DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.mViewPagerObserver = dataSetObserver;
        }
    }

    @java.lang.Deprecated
    public void startUpdate(android.view.View view) {
    }

    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver(dataSetObserver);
    }

    public void finishUpdate(android.view.ViewGroup viewGroup) {
        finishUpdate((android.view.View) viewGroup);
    }

    public void setPrimaryItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        setPrimaryItem((android.view.View) viewGroup, i17, obj);
    }

    public void startUpdate(android.view.ViewGroup viewGroup) {
        startUpdate((android.view.View) viewGroup);
    }
}
