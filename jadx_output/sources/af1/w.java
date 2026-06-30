package af1;

/* loaded from: classes15.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4500a = {1, 1, 1, 1};

    public w(af1.k kVar) {
    }

    public int a(boolean z17, int i17) {
        return (z17 ? com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHF_MASKPROC : 0) | i17;
    }

    public boolean b(int[] iArr, boolean z17) {
        int i17 = z17 ? 268435455 : -1;
        int length = this.f4500a.length - iArr.length;
        int i18 = length;
        boolean z18 = true;
        while (true) {
            int[] iArr2 = this.f4500a;
            if (i18 >= iArr2.length) {
                return z18;
            }
            z18 &= (iArr2[i18] & i17) == (iArr[i18 - length] & i17);
            i18++;
        }
    }

    public void c(boolean z17, int i17) {
        int a17 = a(z17, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "request setMostRecentState [" + z17 + "," + i17 + "], lastState=" + this.f4500a[3] + ", newState=" + a17);
        int[] iArr = this.f4500a;
        int i18 = iArr[3];
        if (i18 == a17) {
            return;
        }
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = i18;
        iArr[3] = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "new MostRecentState [" + this.f4500a[0] + "," + this.f4500a[1] + "," + this.f4500a[2] + "," + this.f4500a[3] + "]");
    }
}
