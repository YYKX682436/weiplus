package com.tencent.map.sdk.utilities.visualization.datamodels;

/* loaded from: classes13.dex */
public class TrailLatLng {
    private com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng[] trailData;

    public TrailLatLng(com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng[] timeLatLngArr) {
        boolean z17;
        if (timeLatLngArr == null || timeLatLngArr.length < 2) {
            this.trailData = new com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng[0];
            return;
        }
        int i17 = 0;
        while (true) {
            z17 = true;
            if (i17 >= timeLatLngArr.length - 1) {
                break;
            }
            int time = timeLatLngArr[i17].getTime();
            i17++;
            if (time >= timeLatLngArr[i17].getTime()) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            this.trailData = timeLatLngArr;
        } else {
            this.trailData = new com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng[0];
        }
    }

    public com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng[] getTrailData() {
        return this.trailData;
    }
}
