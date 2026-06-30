package androidx.recyclerview.widget;

/* loaded from: classes13.dex */
public final class u3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i17];
    }
}
