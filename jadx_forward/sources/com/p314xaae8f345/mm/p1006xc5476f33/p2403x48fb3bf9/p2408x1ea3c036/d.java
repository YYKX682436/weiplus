package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class d implements vz.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b f263695a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b c19258xc2f2ab2b) {
        this.f263695a = c19258xc2f2ab2b;
    }

    public void a(android.os.Bundle bundle) {
        if (bundle.getBoolean("downloadInWidget")) {
            int i17 = bundle.getInt("event");
            int i18 = bundle.getInt("state");
            java.lang.String string = bundle.getString("appId");
            int i19 = bundle.getInt("progress");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo downloadTaskInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo();
            downloadTaskInfo.f263644d = string;
            downloadTaskInfo.f263645e = i18;
            downloadTaskInfo.f263646f = i19;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b c19258xc2f2ab2b = this.f263695a;
            if (i17 == 1 || i17 == 7) {
                if (c19258xc2f2ab2b.f263640h.contains(downloadTaskInfo)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo downloadTaskInfo2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo) c19258xc2f2ab2b.f263640h.get(c19258xc2f2ab2b.f263640h.indexOf(downloadTaskInfo));
                    downloadTaskInfo2.f263645e = i18;
                    downloadTaskInfo2.f263646f = i19;
                } else {
                    c19258xc2f2ab2b.f263640h.add(0, downloadTaskInfo);
                }
            } else if (i17 == 4 || i17 == 9) {
                c19258xc2f2ab2b.f263640h.remove(downloadTaskInfo);
            } else {
                int indexOf = c19258xc2f2ab2b.f263640h.indexOf(downloadTaskInfo);
                if (indexOf != -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo downloadTaskInfo3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b.DownloadTaskInfo) c19258xc2f2ab2b.f263640h.get(indexOf);
                    downloadTaskInfo3.f263645e = i18;
                    downloadTaskInfo3.f263646f = i19;
                }
            }
            c19258xc2f2ab2b.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.c(this));
        }
    }
}
