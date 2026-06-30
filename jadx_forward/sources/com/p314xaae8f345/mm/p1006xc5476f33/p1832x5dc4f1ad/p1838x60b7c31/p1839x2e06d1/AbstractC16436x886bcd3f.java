package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "Landroid/os/Parcelable;", "Event", "FinalCallback", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$Event;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$FinalCallback;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType */
/* loaded from: classes.dex */
public abstract class AbstractC16436x886bcd3f implements android.os.Parcelable {

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$Event;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType$Event */
    /* loaded from: classes.dex */
    public static final /* data */ class Event extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.AbstractC16436x886bcd3f {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.AbstractC16436x886bcd3f.Event> f37487x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.a();

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d f229575d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d event) {
            super(null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            this.f229575d = event;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: equals */
        public boolean m66374xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.AbstractC16436x886bcd3f.Event) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229575d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.AbstractC16436x886bcd3f.Event) obj).f229575d);
        }

        /* renamed from: hashCode */
        public int m66375x8cdac1b() {
            return this.f229575d.hashCode();
        }

        /* renamed from: toString */
        public java.lang.String m66376x9616526c() {
            return "Event(event=" + this.f229575d + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
            out.writeParcelable(this.f229575d, i17);
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$FinalCallback;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType$FinalCallback */
    /* loaded from: classes.dex */
    public static final /* data */ class FinalCallback extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.AbstractC16436x886bcd3f {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.AbstractC16436x886bcd3f.FinalCallback> f37488x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.b();

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d f229576d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinalCallback(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d callbackStr) {
            super(null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackStr, "callbackStr");
            this.f229576d = callbackStr;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: equals */
        public boolean m66378xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.AbstractC16436x886bcd3f.FinalCallback) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229576d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.AbstractC16436x886bcd3f.FinalCallback) obj).f229576d);
        }

        /* renamed from: hashCode */
        public int m66379x8cdac1b() {
            return this.f229576d.hashCode();
        }

        /* renamed from: toString */
        public java.lang.String m66380x9616526c() {
            return "FinalCallback(callbackStr=" + this.f229576d + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
            out.writeParcelable(this.f229576d, i17);
        }
    }

    public AbstractC16436x886bcd3f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }
}
