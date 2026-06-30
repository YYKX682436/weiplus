package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* renamed from: com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView */
/* loaded from: classes8.dex */
public class C19258xc2f2ab2b extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f263638f;

    /* renamed from: g, reason: collision with root package name */
    public vz.j1 f263639g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f263640h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo f263641i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f263642m;

    /* renamed from: n, reason: collision with root package name */
    public int f263643n;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView$DownloadTaskInfo */
    /* loaded from: classes8.dex */
    public static class DownloadTaskInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo> f38714x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.g();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f263644d;

        /* renamed from: e, reason: collision with root package name */
        public int f263645e;

        /* renamed from: f, reason: collision with root package name */
        public int f263646f;

        public DownloadTaskInfo(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d dVar) {
            this.f263644d = parcel.readString();
            this.f263645e = parcel.readInt();
            this.f263646f = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: equals */
        public boolean m74212xb2c87fbf(java.lang.Object obj) {
            return obj != null && (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo) && ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo) obj).f263644d.equals(this.f263644d);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f263644d);
            parcel.writeInt(this.f263645e);
            parcel.writeInt(this.f263646f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView$GetDownloadWidgeInfoTask */
    /* loaded from: classes8.dex */
    public static class GetDownloadWidgeInfoTask extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.GetDownloadWidgeInfoTask> f38715x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.h();

        /* renamed from: f, reason: collision with root package name */
        public java.util.ArrayList f263647f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.Runnable f263648g;

        public /* synthetic */ GetDownloadWidgeInfoTask(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d dVar) {
            this(parcel);
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
        public void v(android.os.Parcel parcel) {
            this.f263647f = parcel.readArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo.class.getClassLoader());
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeList(this.f263647f);
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
        public void y() {
            java.lang.Runnable runnable = this.f263648g;
            if (runnable != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e) runnable).run();
            }
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
        public void z() {
            if (i95.n0.c(m02.s.class) == null) {
                return;
            }
            java.util.LinkedList Ai = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ai();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(Ai)) {
                c();
                return;
            }
            java.util.Iterator it = Ai.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff c13236xb15ab0ff = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo downloadTaskInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo();
                downloadTaskInfo.f263644d = c13236xb15ab0ff.f178760d;
                downloadTaskInfo.f263645e = c13236xb15ab0ff.f178766m;
                downloadTaskInfo.f263646f = c13236xb15ab0ff.f178763g;
                this.f263647f.add(downloadTaskInfo);
            }
            c();
        }

        public GetDownloadWidgeInfoTask() {
            this.f263647f = new java.util.ArrayList();
        }

        private GetDownloadWidgeInfoTask(android.os.Parcel parcel) {
            this.f263647f = new java.util.ArrayList();
            v(parcel);
        }
    }

    public C19258xc2f2ab2b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f263640h = new java.util.concurrent.CopyOnWriteArrayList();
        this.f263642m = false;
        this.f263643n = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadProgressImageView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        this.f263642m = com.p314xaae8f345.mm.ui.bk.C();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f263638f = paint;
        paint.setAntiAlias(true);
        this.f263638f.setStyle(android.graphics.Paint.Style.STROKE);
        this.f263639g = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.GetDownloadWidgeInfoTask getDownloadWidgeInfoTask = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.GetDownloadWidgeInfoTask();
        getDownloadWidgeInfoTask.f263648g = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e(this, getDownloadWidgeInfoTask);
        getDownloadWidgeInfoTask.d();
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.f(this));
    }

    public static void n(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b c19258xc2f2ab2b) {
        c19258xc2f2ab2b.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadProgressImageView", "updateDownloadState");
        c19258xc2f2ab2b.f263641i = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c19258xc2f2ab2b.f263640h)) {
            c19258xc2f2ab2b.m74209x494906bc(1);
            return;
        }
        java.util.Iterator it = c19258xc2f2ab2b.f263640h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo downloadTaskInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo) it.next();
            if (downloadTaskInfo.f263645e == 1) {
                c19258xc2f2ab2b.f263641i = downloadTaskInfo;
                break;
            }
        }
        if (c19258xc2f2ab2b.f263641i != null) {
            c19258xc2f2ab2b.m74209x494906bc(1);
        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo) c19258xc2f2ab2b.f263640h.get(0)).f263645e == 3) {
            c19258xc2f2ab2b.m74209x494906bc(3);
        } else {
            c19258xc2f2ab2b.m74209x494906bc(2);
        }
    }

    /* renamed from: setImageDrawableWrapper */
    private void m74209x494906bc(int i17) {
        this.f263643n = i17;
        r();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vz.l1 l1Var = (vz.l1) i95.n0.c(vz.l1.class);
        vz.j1 j1Var = this.f263639g;
        ((uz.e) l1Var).getClass();
        if (j1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178443g).add(j1Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vz.l1 l1Var = (vz.l1) i95.n0.c(vz.l1.class);
        vz.j1 j1Var = this.f263639g;
        ((uz.e) l1Var).getClass();
        if (j1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178443g).remove(j1Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d;
        }
    }

    public final void r() {
        int i17 = this.f263643n;
        int i18 = i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : this.f263642m ? com.p314xaae8f345.mm.R.raw.f78996x846689f1 : com.p314xaae8f345.mm.R.raw.f78995xd76b8ce4 : this.f263642m ? com.p314xaae8f345.mm.R.raw.f79002x743f3436 : com.p314xaae8f345.mm.R.raw.f79001x3aa8cb7f : this.f263642m ? com.p314xaae8f345.mm.R.raw.f78988xe453510b : com.p314xaae8f345.mm.R.raw.f78987xbed13d8a;
        if (i18 != 0) {
            setImageResource(i18);
        }
    }

    /* renamed from: setDarkMode */
    public void m74210xde5590bb(boolean z17) {
        this.f263642m = z17;
        r();
    }
}
