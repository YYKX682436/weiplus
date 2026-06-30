package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"com/tencent/mm/plugin/magicbrush/IMBAppBrandExportFeature$ServerEvent", "Landroid/os/Parcelable;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "CleanUpPkgImplsEvent", "Lcom/tencent/mm/plugin/magicbrush/IMBAppBrandExportFeature$ServerEvent$CleanUpPkgImplsEvent;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.IMBAppBrandExportFeature$ServerEvent */
/* loaded from: classes7.dex */
public abstract class AbstractC16413x682208b1<T extends android.os.Parcelable> implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Parcelable f229339d;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/IMBAppBrandExportFeature$ServerEvent$CleanUpPkgImplsEvent;", "Lcom/tencent/mm/plugin/magicbrush/IMBAppBrandExportFeature$ServerEvent;", "Landroid/os/Parcelable;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.magicbrush.IMBAppBrandExportFeature$ServerEvent$CleanUpPkgImplsEvent */
    /* loaded from: classes7.dex */
    public static final class CleanUpPkgImplsEvent extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.AbstractC16413x682208b1<android.os.Parcelable> {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.AbstractC16413x682208b1.CleanUpPkgImplsEvent> f37475x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.c4();

        public CleanUpPkgImplsEvent() {
            super(null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
            out.writeInt(1);
        }
    }

    public AbstractC16413x682208b1(android.os.Parcelable parcelable, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f229339d = parcelable;
    }
}
